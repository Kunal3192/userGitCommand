package com.user.git.practice.service;

import com.user.git.practice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList();

    public List<User> getUserList(){
        return userList;
    }
}
