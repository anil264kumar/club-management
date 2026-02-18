package com.example.pass_backend.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pass_backend.model.Club;

import com.example.pass_backend.repository.ClubRepository;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }
}
