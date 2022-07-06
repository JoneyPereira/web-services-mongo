package com.redua.webservicesmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.redua.webservicesmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
}
