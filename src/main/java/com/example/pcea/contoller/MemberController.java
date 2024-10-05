package com.example.pcea.contoller;

import com.example.pcea.entities.Member;
import com.example.pcea.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // Create a new member (POST method)
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }
}