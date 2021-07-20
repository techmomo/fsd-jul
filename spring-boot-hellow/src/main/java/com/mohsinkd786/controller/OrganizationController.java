package com.mohsinkd786.controller;

import com.mohsinkd786.entity.Organization;
import com.mohsinkd786.service.OrganizationService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orgs")
@RestController
public class OrganizationController {

    private OrganizationService organizationService;

    @Autowired
    public void setOrganizationService(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping
    public List<Organization> findOrgs(){
        return organizationService.findOrgs();
    }

    @PostMapping
    public ResponseEntity<Organization> createOrg(@RequestBody Organization organization){
        return ResponseEntity.ok(organizationService.createOrganization(organization));
    }
}
