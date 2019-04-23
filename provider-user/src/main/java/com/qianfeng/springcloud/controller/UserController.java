package com.qianfeng.springcloud.controller;

import com.qianfeng.springcloud.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        System.err.println(new User(id));
        return  new User(id);
    }
}
