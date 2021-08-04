package com.example.ssm_demo.mappers;

import com.example.ssm_demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUserByID(long id);
    public void saveUser(User user);
}
