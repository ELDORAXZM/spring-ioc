package com.jamie.controller;

import com.jamie.service.UserService;
import com.jamie.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Data
@Controller
@NoArgsConstructor
public class UserController {
   @Autowired
    private UserService userService;

   public void saveUser(){
       userService.saveUser();
   }

}
