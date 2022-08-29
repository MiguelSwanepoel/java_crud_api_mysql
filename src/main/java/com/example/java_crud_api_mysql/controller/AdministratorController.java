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
    private AdministratorService adminService;

    @GetMapping(value = "/allAdministrators")
    public List<Administrator> findAllAdministrators(){
        return adminService.getAllAdministrators();
    }

    @GetMapping(value = "/findAdministrator/{id}")
    public Optional<Administrator> findAdministratorById(@PathVariable(value = "id") Long admId){
        return adminService.getAdministratorById(admId);
    }

    @PostMapping(value = "/addAdministrator")
    public void addNewAdministrator(@RequestBody com.example.java_crud_api_mysql.models.Administrator admObj){
        adminService.addNewAdministrator(admObj);
    }

    @PutMapping(value = "/updateAdministrator")
    public void updateNewAdministrator(@RequestBody Administrator admObj){
        adminService.updateAdministratorById(admObj);
    }

    @DeleteMapping(value = "/deleteAdministrator")
    public void deleteNewAdministrator(@RequestBody Administrator admObj){
        adminService.deleteAdministratorById(admObj);
    }
}

