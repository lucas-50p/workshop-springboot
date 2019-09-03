package com.example.springmongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springmongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
