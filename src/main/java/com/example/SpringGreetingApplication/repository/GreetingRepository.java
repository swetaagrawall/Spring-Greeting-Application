package com.example.SpringGreetingApplication.repository;
import com.example.SpringGreetingApplication.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    Greeting findGreetingById(Long id);
}
