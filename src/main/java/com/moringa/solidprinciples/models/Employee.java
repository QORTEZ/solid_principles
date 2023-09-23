package com.moringa.solidprinciples.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "employees")
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private double salary;
    //private Address address;
    //private String trainingStation;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}
