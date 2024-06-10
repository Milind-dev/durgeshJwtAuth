package com.jwt.example.controller;

import com.jwt.example.models.User;
import com.jwt.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("user");
        return userService.getUsers();
    }

//    @GetMapping("/users")
//    public String getUser(){
//        System.out.println("user");
//        return "users";
//    }
}
