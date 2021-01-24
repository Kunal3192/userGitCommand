package com.user.git.practice.service;

import com.user.git.practice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList();
    private int id = 0 ;

    public List<User> getUserList(){
        return userList;
    }

    public void saveMethod(User user){
        id ++;
        user.setId(id);
        userList.add(user);
    }
}
