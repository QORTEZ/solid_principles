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
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setSalary(2000.00);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Jane Doe");
        employee2.setSalary(3000.00);
        employeeRepository.save(employee2);
        return employeeRepository.findAll();
    }

    public List<TrainedEmployee> getTrainedEmployees() {
        TrainedEmployee te1 = new TrainedEmployee(1L, "John Doe Trained", 6000.00, "Mbagathi");
        TrainedEmployee te2 = new TrainedEmployee(2L, "Jane Doe Trained", 6000.00, "CBD");

        trainedEmployeesRepository.save(te1);
        trainedEmployeesRepository.save(te2);
        return trainedEmployeesRepository.findAll();
    }
}
