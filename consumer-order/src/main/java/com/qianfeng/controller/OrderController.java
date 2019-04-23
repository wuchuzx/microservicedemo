package com.qianfeng.controller;

import com.qianfeng.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    private String url="http://localhost:7800/user/";
    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Integer id){
        System.err.println("1111111");
        User user=restTemplate.getForObject(url+id,User.class);
        return user;
    }
}
