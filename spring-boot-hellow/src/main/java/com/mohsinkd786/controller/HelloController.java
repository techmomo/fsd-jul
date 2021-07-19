package com.mohsinkd786.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello! This is a Spring boot application";
    }

    @GetMapping("/add/{i}/{j}")
    public double add(@PathVariable("i") int ab,@PathVariable int j){
        return ab + j;
    }

    @GetMapping("/diff")
    public double subtract(@RequestParam int i,@RequestParam int j){
        return i -j;
    }
}

// http://localhost:8080/sayHello
