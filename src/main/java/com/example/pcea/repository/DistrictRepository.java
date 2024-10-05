package com.example.pcea.repository;

import com.example.pcea.entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface DistrictRepository extends JpaRepository<District, Long> {

    }







