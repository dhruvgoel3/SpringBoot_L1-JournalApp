package com.firstspringapp.journalApp.service;

import java.util.List;

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
}
