package com.example.pcea.contoller;

import com.example.pcea.entities.Visitor;
import com.example.pcea.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Visitor> getAllVisitors() {
        return visitorService.getAllVisitors();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/api/visitors")
    public Visitor createVisitor(@RequestBody Visitor visitor) {
        return visitorService.addVisitor(visitor);
    }


}
