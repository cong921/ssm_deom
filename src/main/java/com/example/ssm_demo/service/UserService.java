package com.example.ssm_demo.service;

import com.example.ssm_demo.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(long id);

    List<User> getUserList();

    void saveUser(User user);


    void deleteUserById(Long id);
}
