package com.example.pcea.contoller;

import com.example.pcea.entities.District;
import com.example.pcea.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController

public class DistrictController {

    @Autowired
    private DistrictRepository districtRepository;


    @PostMapping("/api/districts")
    public ResponseEntity<Object> createDistrict(@RequestBody District district) {

            district.setCreatedAt(LocalDateTime.now());  // Automatically set CreatedAt
            district.setUpdatedAt(LocalDateTime.now());  // Automatically set UpdatedAt
            District savedDistrict = districtRepository.save(district);
            return ResponseEntity.ok(savedDistrict);

    }
}


