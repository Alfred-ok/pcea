package com.example.pcea.service;

import com.example.pcea.entities.VisitorCardLink;
import com.example.pcea.repository.VisitorCardLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorCardLinkService {

    @Autowired
    private VisitorCardLinkRepository repository;

    public List<VisitorCardLink> getAllLinks() {
        return repository.findAll();
    }

    public VisitorCardLink saveLink(VisitorCardLink link) {
        return repository.save(link);
    }

    public void deleteLink(Long id) {
        repository.deleteById(id);
    }
}
