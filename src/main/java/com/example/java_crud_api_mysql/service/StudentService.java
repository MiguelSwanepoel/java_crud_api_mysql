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


    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long stdId){
        return studentRepository.findById(stdId);
    }

    public void addNewStudent(Student stdObj){
        studentRepository.save(stdObj);
    }
    
    public void deleteStudentById(Student studentObj){
        studentRepository.deleteById(studentObj.getId());
    }

    public void updateStudentById(Student studentObj){
        studentRepository.save(studentObj);
    }
}