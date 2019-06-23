package com.demo.web.controller;

import com.demo.web.entity.User;
import com.demo.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liYangYang on 2019/6/23.
 */

@RestController
@RequestMapping("/index")
public class indexController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/port")
    public String port() {

        return "this application port is = " + port;
    }

    @Autowired
    private UserMapper userMapper;


    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userMapper.getUserById(id);
    }


}
