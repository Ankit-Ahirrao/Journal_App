package com.demo.demo.controller;

import java.util.*;
import com.demo.demo.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
@CrossOrigin(origins = "*")   // allow cross-origin requests (change "*" for production)
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry entry){
        journalEntries.put(entry.getId(), entry);
        return true;
    }
}
