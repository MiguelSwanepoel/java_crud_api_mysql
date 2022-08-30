package com.example.java_crud_api_mysql.service;

import com.example.java_crud_api_mysql.models.Registration;
import com.example.java_crud_api_mysql.repository.RegistrationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class Registrationservice {
    
    @Autowired
    private RegistrationRepository registrationRepository;


    public List<Registration> getAllRegistrations(){
        return registrationRepository.findAll();
    }

    public Optional<Registration> getRegistrationById(Long stdId){
        return registrationRepository.findById(stdId);
    }

    public void addNewRegistration(Registration stdObj){
        registrationRepository.save(stdObj);
    }
    
    public void deleteRegistrationById(Registration stdObj){
        registrationRepository.deleteById(stdObj.getId());
    }

    public void updateStudentById(Registration stdObj){
        registrationRepository.save(stdObj);
    }
}
