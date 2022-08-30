package com.example.java_crud_api_mysql.controller;

import com.example.java_crud_api_mysql.models.Registration;
import com.example.java_crud_api_mysql.service.Registrationservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegistrationController {

    @Autowired
    private Registrationservice registrationService;

    @GetMapping(value = "/allRegistration")
    public List<Registration> findAllRegistrations(){
        return registrationService.getAllRegistrations();
    }

    @GetMapping(value = "/findRegistrations/{id}")
    public Optional<Registration> findRegistrationById(@PathVariable(value = "id") Long stdId){
        return registrationService.getRegistrationById(stdId);
    }

    @PostMapping(value = "/addRegistration")
    public void addNewRegistration(@RequestBody com.example.java_crud_api_mysql.models.Registration empObj){
        registrationService.addNewRegistration(empObj);
    }

    @PutMapping(value = "/updateRegistration")
    public void updateNewRegistration(@RequestBody Registration empObj){
        registrationService.updateStudentById(empObj);
    }

    @DeleteMapping(value = "/deleteStudent")
    public void deleteNewRegistration(@RequestBody Registration empObj){
        registrationService.deleteRegistrationById(empObj);
    }
}