package com.example.SpringGreetingApplication.controller;
import com.example.SpringGreetingApplication.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public Map<String, String> getGreeting(@RequestParam(required = false) String firstName,
                                           @RequestParam(required = false) String lastName) {
        String message = greetingService.getGreetingMessage(firstName, lastName);
        return Map.of("message", message);
    }
}

