package com.example.demo.model;

public class Job {
    protected float salary;
    protected int bonus;
    protected Jobs workers;

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public Job(float salary, int bonus, Jobs workers){

        this.workers=workers;
        this.salary=salary;
        this.bonus=bonus;

    }

    public void getInfo() {
        System.out.println(workers.name + "'s salary is " + salary + " and bonus is " + bonus+ ".");
    }
}
