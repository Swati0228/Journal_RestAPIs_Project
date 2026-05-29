package net.swatiisingh.JournalApplication.service;

import net.swatiisingh.JournalApplication.entry.Journel_entry;
import net.swatiisingh.JournalApplication.repository.JournelEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class JournelentryService {
    @Autowired
    private JournelEntryRepo journelEntryRepo;
    public void save(Journel_entry journel_entry){
        journelEntryRepo.save(journel_entry);
    }
}
