package com.example.SpringGreetingApplication.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, world!");
        return ResponseEntity.ok(response);
    }

     @PostMapping
    public ResponseEntity<Map<String, String>> createGreeting(@RequestBody Map<String, String> greeting) {
        greeting.put("status", "created");
        return ResponseEntity.status(HttpStatus.CREATED).body(greeting);
    }
  @PutMapping
    public ResponseEntity<Map<String, String>> updateGreeting(@RequestBody Map<String, String> greeting) {
        greeting.put("status", "updated");
        return ResponseEntity.ok(greeting);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, String>> deleteGreeting() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "deleted");
        return ResponseEntity.ok(response);
    }
}

