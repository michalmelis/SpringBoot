package com.example.demo.services;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void saveCompany(Company company){
        companyRepository.save(company);
    }
}
