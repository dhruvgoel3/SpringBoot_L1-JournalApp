package com.firstspringapp.journalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringapp.journalApp.entity.User;
import com.firstspringapp.journalApp.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    public List<User> getAllUsers() {
        return userService.getAll(null);
    }

    public void createUser(@RequestBody User user)
    {
        userService.saveEntry(user);
    }

}
