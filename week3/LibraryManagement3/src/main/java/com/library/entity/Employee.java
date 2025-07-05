package com.library.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private double salary;

    // Getters and Setters
}
