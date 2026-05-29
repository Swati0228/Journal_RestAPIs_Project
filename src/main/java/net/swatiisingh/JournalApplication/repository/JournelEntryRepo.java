package net.swatiisingh.JournalApplication.repository;

import net.swatiisingh.JournalApplication.entry.Journel_entry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournelEntryRepo extends MongoRepository<Journel_entry,String> {
}
