package com.firstspringapp.journalApp.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import com.firstspringapp.journalApp.entity.User;
import com.firstspringapp.journalApp.repository.UserRepository;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user) {
        userRepository.save(user);

    }

    // public List<User> getAll(ObjectId Id) {
    //     return userRepository.findById(Id);
    // }

    public Optional<User> findById(ObjectId myId) {
        return userRepository.findById(myId);
    }

    public void deleteById(ObjectId Id) {
        userRepository.deleteById(Id);
    }

}
