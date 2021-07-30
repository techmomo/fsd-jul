package com.mohsinkd786.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomeResource {

    @GetMapping
    public ResponseEntity<String> message(){
        return ResponseEntity.ok("Spring Jenkins ");
    }
}
