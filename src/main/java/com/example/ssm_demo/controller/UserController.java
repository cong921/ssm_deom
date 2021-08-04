package com.example.ssm_demo.controller;

import com.example.ssm_demo.entity.User;
import com.example.ssm_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @GetMapping(value = "/userlist")
    public String userlist(HttpServletRequest request){
        List<User> users = userService.getUserList();
        request.setAttribute("users",users);
        return "userlist";
    }
    @ResponseBody
    @PostMapping(value = "/addUser")
    public Map addUser(@RequestBody User user){
        try{
            userService.saveUser(user);
        }catch(Exception e){
            System.out.println("插入失败！");
        }
        Map res=new HashMap<>();
        res.put("msg","success");
       return res;
    }
    @ResponseBody
    @GetMapping(value = "/deleteUserById")
    public Map deleteUserById(Long id){
        try{
            userService.deleteUserById(id);
        }catch(Exception e){
            System.out.println("插入失败！");
        }
        Map res=new HashMap<>();
        res.put("msg","success");
       return res;
    }
    //http://localhost:8080/user/testArrays?args=3&args=1
//    http://localhost:8080/user/testArrays?args=3,1
    @ResponseBody
    @GetMapping(value = "/testArrays")
    public List testArrays(@RequestParam String...args){
        return Arrays.asList(args);
    }


}
