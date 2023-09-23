package com.moringa.solidprinciples.controllers;


import com.moringa.solidprinciples.models.Employee;
import com.moringa.solidprinciples.models.TrainedEmployee;
import com.moringa.solidprinciples.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> getEmployees() {

        return employeeService.getEmployees();
    }

    @GetMapping("/trained")
    public List<TrainedEmployee> getTrainedEmployees() {

        return employeeService.getTrainedEmployees();
    }

}
