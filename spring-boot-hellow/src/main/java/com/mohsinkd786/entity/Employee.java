package com.mohsinkd786.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {
    //private int id;
    @GeneratedValue
    @Id
    public int eId;
    @Column(name = "ename")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id",nullable = false)
    private Project project;
}
