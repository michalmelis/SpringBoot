package com.example.demo;

import org.springframework.boot.autoconfigure.data.jpa.EntityManagerFactoryDependsOnPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class WriteNumber {
    EmployeeService employeeService;

    public WriteNumber(EmployeeService employeeService) {
        this.employeeService = employeeService;
        System.out.println(employeeService.writeNumber());
    }
}
