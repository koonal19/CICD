package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @GetMapping("/users")
    public ResponseEntity<String> getAllUsers() {
        return new ResponseEntity<String>(" Api working fine", HttpStatus.OK);
    }
}
