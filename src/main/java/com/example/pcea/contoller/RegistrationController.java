package com.example.pcea.contoller;


import com.example.pcea.entities.Registration;
import com.example.pcea.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class RegistrationController {

    @Autowired
    private RegistrationRepository registrationRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/api/registration")
    public ResponseEntity<Registration> register(@RequestBody Registration registration) {
        Registration savedRegistration = registrationRepository.save(registration);
        return ResponseEntity.ok(savedRegistration);
    }
}