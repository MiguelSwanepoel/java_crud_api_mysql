package com.example.java_crud_api_mysql.controller;

import com.example.java_crud_api_mysql.models.Administrator;
import com.example.java_crud_api_mysql.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    // END POINT TO FETCH ALL EMPLOYEES
    @GetMapping(value = "/allAdministrator")
    public List<Administrator> findAllAdministrator(){
        return administratorService.getAllAdministrators();
    }

    // END POINT TO FETCH SINGLE EMPLOYEE
    @GetMapping(value = "/findAdministrator/{id}")
    public Optional<Administrator> findAdministratorById(@PathVariable(value = "id") Long admId){
        return AdministratorService.getAdministratorById(admId);
    }

    // END POINT TO ADD NEW EMPLOYEE
    @PostMapping(value = "/addAdministrator")
    public void addNewAdministrator(@RequestBody com.example.java_crud_api_mysql.models.Administrator admObj){
        AdministratorService.addNewAdministrator(admObj);
    }

    // END POINT TO UPDATE AN EMPLOYEE
    @PutMapping(value = "/updateAdministrator")
    public void updateNewStudent(@RequestBody Administrator admObj){
        administratorService.updateAdministratorById(admObj);
    }

    // END POINT TO DELETE AN EMPLOYEE
    @DeleteMapping(value = "/deleteAdministrator")
    public void deleteNewAdministrator(@RequestBody Administrator admObj){
        AdministratorService.deleteAdministratorById(admObj);
    }
}