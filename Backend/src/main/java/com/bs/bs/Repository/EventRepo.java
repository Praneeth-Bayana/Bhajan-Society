package com.bs.bs.Repository;

import com.bs.bs.Model.Entity.Events;
import com.bs.bs.Model.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EventRepo extends MongoRepository<Events, Long> {
}
