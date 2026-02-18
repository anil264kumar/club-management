package com.example.pass_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.pass_backend.model.Club;

@Repository
public interface ClubRepository extends MongoRepository<Club, String> {
}
