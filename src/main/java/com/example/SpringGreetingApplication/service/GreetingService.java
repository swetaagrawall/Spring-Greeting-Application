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

    public Greeting findGreetingById(Long id) {
        return greetingRepository.findGreetingById(id);
    }
}

