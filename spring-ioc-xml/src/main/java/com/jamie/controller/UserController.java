package com.jamie.controller;

import com.jamie.service.UserService;
import com.jamie.service.impl.UserServiceImpl;
import lombok.Data;

@Data
public class UserController {

    private UserService userService;


    public void saveUser(){
        userService.saveUser();

    }

}
