package com.example.pass_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pass_backend.model.Club;
import com.example.pass_backend.service.ClubService;

@RestController
@RequestMapping("/api/clubs")
@CrossOrigin(origins = "https://frabjous-profiterole-e90bdd.netlify.app")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping
    public ResponseEntity<List<Club>> getAllClubs() {
        return ResponseEntity.ok(clubService.getAllClubs());
    }

    @PostMapping
    public ResponseEntity<Club> createClub(@RequestBody Club club) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clubService.saveClub(club));
    }
}
