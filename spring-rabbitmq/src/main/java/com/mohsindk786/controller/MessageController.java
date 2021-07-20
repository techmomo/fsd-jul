package com.mohsindk786.controller;

import com.mohsindk786.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/messages")
@RestController
public class MessageController {

    private MessageService service;

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    // send message
    @PostMapping("/publish")
    public ResponseEntity<Boolean> publishMessage(@RequestBody String message){
        return ResponseEntity.ok(service.publishMessage(message));
    }
}
