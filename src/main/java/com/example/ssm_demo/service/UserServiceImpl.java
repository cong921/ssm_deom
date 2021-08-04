package com.example.ssm_demo.service;

import com.example.ssm_demo.entity.User;
import com.example.ssm_demo.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
