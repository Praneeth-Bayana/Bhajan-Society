package com.bs.bs.Repository;

import com.bs.bs.Model.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> {
    //User findAll(String userEmail);
    @Query("{ 'userEmail' : ?0 }")
    User findByEmail(String userEmail);
    @Query("{ 'userEmail' : ?0, 'userPassword' : ?1 }")
    Optional<User> findByUserEmailAndUserPassword(String userEmail, String userPassword);


}
