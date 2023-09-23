package com.moringa.solidprinciples.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TrainedEmployee extends Employee {

    private String trainingStation;

    public  TrainedEmployee(String name, double salary, String trainingStation) {
        super(name, salary);
        this.trainingStation = trainingStation;
    }

}
