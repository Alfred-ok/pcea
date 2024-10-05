package com.example.pcea.contoller;

import com.example.pcea.entities.Elder;
import com.example.pcea.service.ElderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elders")
public class ElderController {

    @Autowired
    private ElderService elderService;

    @PostMapping
    public ResponseEntity<Elder> createElder(@RequestBody Elder elder) {
        Elder createdElder = elderService.createElder(elder);
        return ResponseEntity.ok(createdElder);
    }
}
