package net.swatiisingh.JournalApplication.controller;

import net.swatiisingh.JournalApplication.entry.Journel_entry;
import net.swatiisingh.JournalApplication.service.JournelentryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/_journel")
public class JournelAppController {

    private HashMap<Long, Journel_entry> map = new HashMap<>();
    @Autowired
    private JournelentryService journelentryService;

    // GET ALL
    @GetMapping
    public List<Journel_entry> getAll() {
        return new ArrayList<>(map.values());
    }

    // CREATE
    @PostMapping
    public boolean createEntry(@RequestBody Journel_entry myentry) {
        map.put(myentry.getId(), myentry);
        return true;
    }

    // GET BY ID
    @GetMapping("/id/{myId}")
    public Journel_entry getJourneybyId(@PathVariable Long myId) {
        return map.get(myId);
    }

    // DELETE
    @DeleteMapping("/id/{myId}")
    public Journel_entry deleteById(@PathVariable Long myId) {
        return map.remove(myId);
    }

    // UPDATE
    @PutMapping("/id/{myId}")
    public Journel_entry updateEntry(
            @PathVariable Long myId,
            @RequestBody Journel_entry newEntry) {

        return map.put(myId, newEntry);
    }
}