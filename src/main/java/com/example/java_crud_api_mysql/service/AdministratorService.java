package com.example.java_crud_api_mysql.service;

import com.example.java_crud_api_mysql.models.Administrator;
import com.example.java_crud_api_mysql.repository.AdministratorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AdministratorService {
    @Autowired
    private AdministratorRepository administratorRepository;

    public List<Administrator> getAllAdministrators(){
        return administratorRepository.findAll();
    }

    public Optional<Administrator> getAdministratorById(Long admId){
        return administratorRepository.findById(admId);
    }

    public void addNewAdministrator(Administrator admObj){
        administratorRepository.save(admObj);
    }

    public void deleteAdministratorById(Administrator administratorObj){
        administratorRepository.deleteById(administratorObj.getId());
    }

    public void updateAdministratorById(Administrator administratorObj){
        administratorRepository.save(administratorObj);
    }
}
