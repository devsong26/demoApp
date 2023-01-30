package com.example.demo.controller;

import com.example.demo.data.dto.MemberFindDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/member")
public class MemberController {

    @GetMapping(value = "/find")
    public MemberFindDto.Response find(MemberFindDto.Request req){

        return null;
    }

}
