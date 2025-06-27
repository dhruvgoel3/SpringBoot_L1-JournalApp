package com.firstspringapp.journalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringapp.journalApp.entity.JournalEntry;
import com.firstspringapp.journalApp.service.JournalEntryService;

import java.time.LocalDateTime;
import java.util.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping()
    public List<JournalEntry> allGet() {
        return journalEntryService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return true;

    }

    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
        return null;

    }

}
// THis is copy

// Best Practice is :-
// CON