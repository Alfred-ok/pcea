package com.example.pcea.repository;

import com.example.pcea.entities.Elder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElderRepository extends JpaRepository<Elder, Long> {


}

