package com.mohsinkd786.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString
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
