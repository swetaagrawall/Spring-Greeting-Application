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

    public boolean deleteGreeting(Long id) {
        Greeting greeting = greetingRepository.findGreetingById(id);
        if (greeting != null) {
            greetingRepository.delete(greeting);
            return true;
        }
        return false;
    }
}
