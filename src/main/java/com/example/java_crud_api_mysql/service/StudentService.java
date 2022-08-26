package com.example.java_crud_api_mysql.service;

import com.example.java_crud_api_mysql.models.Student;
import com.example.java_crud_api_mysql.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

     @Autowired
    private StudentRepository studentRepository;


    // FETCHING ALL EMPLOYEE DATA
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // FETCHING EMPLOYEE BY ID
    public Optional<Student> getStudentById(Long stdId){
        return studentRepository.findById(stdId);
    }

    // ADD NEW EMPLOYEE
    public void addNewStudent(Student stdObj){
        studentRepository.save(stdObj);
    }

    // DELETING EMPLOYEE BY ID
    public void deleteStudentById(Student studentObj){
        studentRepository.deleteById(studentObj.getId());
    }

    // UPDATING EMPLOYEE BY ID
    public void updateStudentById(Student studentObj){
        studentRepository.save(studentObj);
    }
}