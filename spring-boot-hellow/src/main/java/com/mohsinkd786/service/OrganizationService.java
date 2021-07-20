package com.mohsinkd786.service;

import com.mohsinkd786.entity.Organization;
import com.mohsinkd786.repository.AddressRepository;
import com.mohsinkd786.repository.OrganizationRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {
    private OrganizationRepository organizationRepository;
    private AddressRepository addressRepository;

    @Autowired
    public void setOrganizationRepository(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Autowired
    public void setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Organization createOrganization(Organization organization){
        Organization savedEntity = organizationRepository.save(organization);
        return savedEntity;
    }
    public List<Organization> findOrgs(){
        return organizationRepository.findAll();
    }
}
