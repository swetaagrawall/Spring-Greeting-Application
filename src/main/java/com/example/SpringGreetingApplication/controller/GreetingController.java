package com.example.SpringGreetingApplication.controller;
import com.example.SpringGreetingApplication.model.Greeting;
import com.example.SpringGreetingApplication.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/{id}")
    public Map<String, String> getGreetingById(@PathVariable Long id) {
        Greeting greeting = greetingService.findGreetingById(id);
        return Map.of("message", greeting.getMessage());
    }
}
