package com.mohsinkd786.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Project {
    @GeneratedValue
    @Id
    private int id;
    private String name;
    private double budget;

    @OneToMany(mappedBy = "project")
    private Set<Employee> employees;
}
