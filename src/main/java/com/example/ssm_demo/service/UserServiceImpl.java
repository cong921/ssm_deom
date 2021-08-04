package com.example.ssm_demo.service;

import com.example.ssm_demo.entity.User;
import com.example.ssm_demo.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapping;
    @Override
    public User getUserById(long id){
        User userByID = userMapping.getUserByID(id);
        System.out.println(userByID);
        return userByID;
    }

    @Override
    public List<User> getUserList() {

        return  userMapping.getUserList();
    }
    @Override
    public void saveUser(User user) {

        userMapping.saveUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapping.deleteUserById(id);
    }
}
