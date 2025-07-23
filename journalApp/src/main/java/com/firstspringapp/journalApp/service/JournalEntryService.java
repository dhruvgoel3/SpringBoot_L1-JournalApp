package com.firstspringapp.journalApp.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstspringapp.journalApp.entity.JournalEntry;
import com.firstspringapp.journalApp.repository.JournalEntryRepository;

@Service
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);

    }
    public List<JournalEntry> getAll()
    {
        return journalEntryRepository.findAll();
    }
    public Optional<JournalEntry> findById(ObjectId myId)
    {
        return journalEntryRepository.findById(myId);
    }

   


}
