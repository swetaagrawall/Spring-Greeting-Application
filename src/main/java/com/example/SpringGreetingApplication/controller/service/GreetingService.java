package com.example.SpringGreetingApplication.controller.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello World";
    }
}
