package com.example.SpringGreetingApplication.service;

import com.example.SpringGreetingApplication.model.Greeting;
import com.example.SpringGreetingApplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {


    private final GreetingRepository greetingRepository;

    @Autowired
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello, " + firstName;
        } else if (lastName != null) {
            return "Hello, " + lastName;
        } else {
            Greeting greeting = greetingRepository.findById(1L).orElse(new Greeting(1L, "Hello World"));
            return greeting.getMessage();
        }
    }

    public Greeting saveGreetingMessage(String message) {
        Greeting greeting = new Greeting(1L, message);
        return greetingRepository.save(greeting);
    }
}
