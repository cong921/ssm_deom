package com.example.ssm_demo.controller;

import com.example.ssm_demo.entity.User;
import com.example.ssm_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/getUserById/{id}")
    @ResponseBody
    public User getUserById(@PathVariable String id){
        User userById = userService.getUserById(Long.parseLong(id));
        return userById;
    }
}
