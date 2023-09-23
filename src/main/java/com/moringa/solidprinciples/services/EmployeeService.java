package com.moringa.solidprinciples.services;

import com.moringa.solidprinciples.models.Address;
import com.moringa.solidprinciples.models.Employee;
import com.moringa.solidprinciples.repositories.AddressRepository;
import com.moringa.solidprinciples.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    AddressService addressService;

    public List<Employee> getEmployees() {
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setSalary(2000.00);
        Address address = addressService.saveAddress("Kaunda Street");
        employee1.setAddress(address);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Jane Doe");
        employee2.setSalary(3000.00);
        Address address2 = addressService.saveAddress("Moi Avenue");
        employee2.setAddress(address2);
        employeeRepository.save(employee2);
        return employeeRepository.findAll();
    }
}
