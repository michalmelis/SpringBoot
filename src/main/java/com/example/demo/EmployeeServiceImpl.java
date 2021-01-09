package com.example.demo;
import com.example.demo.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;

import java.awt.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    int number = 0;

    @Override
    public float countallSalary(List<Job> typesOfJob){
        return(float) typesOfJob.stream().mapToDouble(i -> i.getSalary()).sum();
}

    @Override
    public int countallBonus(List<Job> typesOfJob) {
        return typesOfJob.stream().mapToInt(i -> i.getBonus()).sum();
    }

    @Override
    public int writeNumber(){
       return number+=1;
    }

}
