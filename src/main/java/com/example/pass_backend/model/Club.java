package com.example.pass_backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clubs")
public class Club {

    @Id
    private String id;

    private String clubName;
    private String description;

    public Club() {
    }

    public Club(String clubName, String description) {
        this.clubName = clubName;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
