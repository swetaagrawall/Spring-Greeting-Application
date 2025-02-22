package com.example.SpringGreetingApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Greeting {
    @Id
    private Long id;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

