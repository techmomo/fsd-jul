package com.mohsindk786.controller;

import com.mohsindk786.dto.OrgDto;
import com.mohsindk786.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/orgs")
@RestController
public class OrganizationController {

    private OrgService service;

    @Autowired
    public void setService(OrgService service) {
        this.service = service;
    }

    @PostMapping("/publish")
    public ResponseEntity<Boolean> publishOrg(@RequestBody OrgDto orgDto){
        return  ResponseEntity.ok(service.publishOrgToQueue(orgDto));
    }
}
