package com.example.pcea.service;


import com.example.pcea.entities.Elder;
import com.example.pcea.repository.ElderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ElderService {

    @Autowired
    private ElderRepository elderRepository;

    public Elder createElder(Elder elder) {
        elder.setCreatedAt(LocalDateTime.now());
        return elderRepository.save(elder);
    }
}

