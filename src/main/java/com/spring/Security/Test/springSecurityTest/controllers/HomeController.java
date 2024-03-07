package com.spring.Security.Test.springSecurityTest.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/normal")
    public ResponseEntity<String> normalUser(){
    return ResponseEntity.ok("Yes I Am Normal User");

    }
    @GetMapping("/adminUser")
    public ResponseEntity<String> adminUser(){
        return ResponseEntity.ok("Yes I Am Admin User");

    }
    @GetMapping("/public")
    public ResponseEntity<String> publicUser(){
        return ResponseEntity.ok("Yes I Am Normal User");

    }
}
