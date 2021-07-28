package com.mohsinkd786.controller;

import com.mohsinkd786.entity.User;
import com.mohsinkd786.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService service;
    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }
    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }
    @GetMapping("{id}")
    public User findById(@PathVariable int id){
        return service.findById(id);
    }
}
