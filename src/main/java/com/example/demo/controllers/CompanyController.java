package com.example.demo.controllers;

import com.example.demo.model.Address;
import com.example.demo.model.Company;
import com.example.demo.services.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping
public class CompanyController {
    CompanyService service;

    public CompanyController(CompanyService service) {

        this.service = service;

    }


    @GetMapping("/company")

    public  void company(){

        Company company=new Company("Štefan");
        Address address=new Address("Zákysučie","02302","Krásno nad Kysucou","Slovakia");
        company.setAddress(address);
        service.saveCompany(company);

    }
}
