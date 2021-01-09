package com.example.demo;

import com.example.demo.model.Driver;
import com.example.demo.model.Job;
import com.example.demo.model.Programmer;
import com.example.demo.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo {
    EmployeeService employeeService;
    List<Job> typesOfJob = Arrays.asList(new Teacher(500,200),new Programmer(1000,200), new Driver(700,150));

    public DependencyInjectionDemo(EmployeeService employeeService) {
        this.employeeService = employeeService;
        System.out.println(getSum());
        System.out.println(employeeService.writeNumber());
    }

    public float getSum(){
        return (employeeService.countallBonus(typesOfJob) + employeeService.countallSalary(typesOfJob));

    };
}
