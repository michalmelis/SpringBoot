package com.example.demo;
import com.example.demo.model.Job;

import java.util.List;

import java.awt.*;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public float countallSalary(List<Job> typesOfJob){
        return(float) typesOfJob.stream().mapToDouble(i -> i.getSalary()).sum();
}

    @Override
    public int countallBonus(List<Job> typesOfJob) {
        return typesOfJob.stream().mapToInt(i -> i.getBonus()).sum();
    }

}
