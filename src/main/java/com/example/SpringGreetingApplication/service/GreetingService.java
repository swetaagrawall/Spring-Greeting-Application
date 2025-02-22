package com.example.SpringGreetingApplication.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello, " + firstName;
        } else if (lastName != null) {
            return "Hello, " + lastName;
        } else {
            return "Hello World";
        }
    }
}
