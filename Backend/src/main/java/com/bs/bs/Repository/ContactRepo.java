package com.bs.bs.Repository;

import com.bs.bs.Model.Entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepo extends MongoRepository<Contact, String> {
}
