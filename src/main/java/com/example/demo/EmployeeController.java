package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(value = "/hello")
    public String firstEndpoint(){
        return "Hello Spring Boot";
    }

    @GetMapping(value = "/snail")
    public double snail(@RequestParam double lenghtStairs,@RequestParam double heightStairs, @RequestParam int heightTower){
        return (heightTower/heightStairs)*(lenghtStairs+heightStairs);
    }
}