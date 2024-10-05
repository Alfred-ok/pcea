package com.example.pcea.service;

import com.example.pcea.entities.Visitor;
import com.example.pcea.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;

    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }

    public Visitor addVisitor(Visitor visitor) {
        return visitorRepository.save(visitor);
    }


}

