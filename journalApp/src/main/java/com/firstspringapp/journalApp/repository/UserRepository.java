package com.firstspringapp.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.firstspringapp.journalApp.entity.User;


public interface UserRepository extends MongoRepository<User, ObjectId> {

}
