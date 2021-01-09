package com.example.demo.model;



public  class Programmer extends Job {

    public Programmer(float salary,int bonus) {

        super(salary,bonus, Jobs.PROGRAMMER);
    }

    @Override
    public void getInfo() {
        System.out.println(workers.name + "'s salary is " + (salary + bonus) +  ".");
    }
}
