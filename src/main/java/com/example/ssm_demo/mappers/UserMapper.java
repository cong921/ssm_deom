package com.example.ssm_demo.mappers;

import com.example.ssm_demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public User getUserByID(long id);
    public void saveUser(User user);
    public List<User> getUserList();

    void deleteUserById(Long id);
}
