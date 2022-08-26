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


    // FETCHING ALL EMPLOYEE DATA
    public List<Administrator> getAllAdministrators(){
        return administratorRepository.findAll();
    }

    // FETCHING EMPLOYEE BY ID
    public Optional<Administrator> getAdministratorById(Long admId){
        return administratorRepository.findById(admId);
    }

    // ADD NEW EMPLOYEE
    public void addNewAdministrator(Administrator admObj){
        administratorRepository.save(admObj);
    }

    // DELETING EMPLOYEE BY ID
    public void deleteAdministratorById(Administrator administratorObj){
        administratorRepository.deleteById(administratorObj.getId());
    }

    // UPDATING EMPLOYEE BY ID
    public void updateAdministratorById(Administrator administratorObj){
        administratorRepository.save(administratorObj);
    }
}
