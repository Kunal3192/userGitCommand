package com.user.git.practice.controller;

import com.user.git.practice.model.User;
import com.user.git.practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/git")
public class UserController {

    @Autowired
    private UserService userService;

    public List<User> getUserList(){
        System.out.println("Getting all Users");
        return userService.getUserList();
    }
}
