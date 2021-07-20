package com.mohsinkd786.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;


@ToString
@Data
@Entity
public class Organization {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    private Address address;
}
