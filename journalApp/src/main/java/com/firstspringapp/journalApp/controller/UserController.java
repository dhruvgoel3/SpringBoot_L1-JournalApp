package com.firstspringapp.journalApp.controller;

import java.rmi.NotBoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringapp.journalApp.entity.User;
import com.firstspringapp.journalApp.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.saveEntry(user);
    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        User userInDB = userService.findByUserName(user.getUserName());
        if (userInDB != null) {
            userInDB.setUserName(user.getUserName());
            userInDB.setPassword((user.getPassword()));
            userService.saveEntry(userInDB);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
