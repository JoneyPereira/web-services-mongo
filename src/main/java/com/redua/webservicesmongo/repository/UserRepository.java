package com.redua.webservicesmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.redua.webservicesmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
