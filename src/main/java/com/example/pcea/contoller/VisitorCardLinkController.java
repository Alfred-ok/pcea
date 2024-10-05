package com.example.pcea.contoller;

import com.example.pcea.entities.VisitorCardLink;
import com.example.pcea.service.VisitorCardLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitor-card-link")
public class VisitorCardLinkController {

    @Autowired
    private VisitorCardLinkService service;

    @GetMapping
    public List<VisitorCardLink> getAllLinks() {
        return service.getAllLinks();
    }

    @PostMapping
    public VisitorCardLink createLink(@RequestBody VisitorCardLink link) {
        return service.saveLink(link);
    }

    @DeleteMapping("/{id}")
    public void deleteLink(@PathVariable Long id) {
        service.deleteLink(id);
    }
}
