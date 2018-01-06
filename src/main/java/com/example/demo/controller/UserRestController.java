package com.example.demo.controller;

import com.example.demo.entiry.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {
    @Autowired
    private UserService userService;
    private User user;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public User saveUser() {
        user.setName("Joe");
        user.setCreatedate(new Date());
        return userService.save(user);
    }
}
