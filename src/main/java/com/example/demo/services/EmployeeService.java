package com.example.demo.services;

import com.example.demo.model.Job;

import java.util.List;

public interface EmployeeService {
    float countallSalary(List<Job> typesOfJob);
    int   countallBonus(List<Job>typesOfJob);
    int writeNumber();
}

