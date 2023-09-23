package com.moringa.solidprinciples.repositories;

import com.moringa.solidprinciples.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
