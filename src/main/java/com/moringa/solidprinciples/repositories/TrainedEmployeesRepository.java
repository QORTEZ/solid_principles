package com.moringa.solidprinciples.repositories;

import com.moringa.solidprinciples.models.TrainedEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainedEmployeesRepository extends JpaRepository<TrainedEmployee, Long> {
}
