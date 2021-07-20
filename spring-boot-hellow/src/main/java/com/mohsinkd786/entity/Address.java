package com.mohsinkd786.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Address {
    @GeneratedValue
    @Id
    private Long id;
    private String city;
    private String street;
    private String zipCode;
}
