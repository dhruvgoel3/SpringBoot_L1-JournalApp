package com.firstspringapp.journalApp.repository;

import java.beans.JavaBean;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.firstspringapp.journalApp.entity.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}
