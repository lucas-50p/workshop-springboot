package com.example.springmongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springmongoDB.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
