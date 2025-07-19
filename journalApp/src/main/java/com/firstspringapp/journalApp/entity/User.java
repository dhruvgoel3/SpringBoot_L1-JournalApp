package com.firstspringapp.journalApp.entity;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.mongodb.lang.NonNull;

public class User {
     @Id
    private ObjectId id;
    @Indexed(unique = true)     // It recieves only unique usernames
    @NonNull                    // NonNull means these fields
    private String userName;
    @NonNull
    private String password;
      @DBRef
    private List<JournalEntry> journalEntry = new ArrayList<>(); 


}
