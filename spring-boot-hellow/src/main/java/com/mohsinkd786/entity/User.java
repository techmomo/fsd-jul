package com.mohsinkd786.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    private int id;
    private String name;
    private Date dob;
    private double salary;
}
