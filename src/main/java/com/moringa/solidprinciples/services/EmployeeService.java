package com.moringa.solidprinciples.services;

import com.moringa.solidprinciples.models.Employee;
import com.moringa.solidprinciples.models.TrainedEmployee;
import com.moringa.solidprinciples.repositories.EmployeeRepository;
import com.moringa.solidprinciples.repositories.TrainedEmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    AddressService addressService;
    @Autowired
    TrainedEmployeesRepository trainedEmployeesRepository;

    public List<Employee> getEmployees() {
        employeeRepository.save(new Employee("John Doe", 2000.00));
        employeeRepository.save(new Employee("Jane Doe", 2000.00));
        return employeeRepository.findAll();
    }

    public List<TrainedEmployee> getTrainedEmployees() {
        trainedEmployeesRepository.save(new TrainedEmployee( "John Doe Trained", 6000.00, "Mbagathi"));
        trainedEmployeesRepository.save(new TrainedEmployee("Jane Doe Trained", 6000.00, "CBD"));
        return trainedEmployeesRepository.findAll();
    }
}
