package com.firstspringapp.journalApp.entity;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document(collection = "users")
@Data
public class User {
  @Id
  private ObjectId id;
  @Indexed(unique = true) // It recieves only unique usernames
  @NonNull // NonNull means these fields
  private String userName;
  @NonNull
  private String password;

  @DBRef    // creating reference of journalentry in user
  private List<JournalEntry> journalEntry = new ArrayList<>();

}
// user pojo/entity