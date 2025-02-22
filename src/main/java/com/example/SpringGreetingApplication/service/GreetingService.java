package com.example.SpringGreetingApplication.service;

import com.example.SpringGreetingApplication.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringGreetingApplication.repository.GreetingRepository;
@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    @Autowired
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting updateGreetingMessage(Long id, String newMessage) {
        Greeting greeting = greetingRepository.findGreetingById(id);
        if (greeting != null) {
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        }
        return null;
    }
}


