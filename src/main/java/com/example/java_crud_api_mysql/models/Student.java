package com.example.java_crud_api_mysql.models;

import javax.persistence.*;

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String contact;
    private String email;
    private String password;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String adress) {
        this.contact = adress;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Student(){}
    public Student(Long id, String address, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.contact = address;
        this.email = email;
        this.password = password;
    }    
}