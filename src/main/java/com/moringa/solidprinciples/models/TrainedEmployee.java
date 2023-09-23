package com.moringa.solidprinciples.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trained_employees")
@NoArgsConstructor
@AllArgsConstructor
public class TrainedEmployee extends Employee {

    @Id
    private Long id;

    private String trainingStation;

    public  TrainedEmployee(Long id, String name, double salary, String trainingStation) {
        super(id, name, salary);
        this.trainingStation = trainingStation;
    }

}
