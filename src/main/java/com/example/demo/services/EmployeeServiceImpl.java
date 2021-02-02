package com.example.demo.services;
import com.example.demo.model.Job;
import com.example.demo.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

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
