package com.example.java_crud_api_mysql.controller;

import com.example.java_crud_api_mysql.models.Student;
import com.example.java_crud_api_mysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/allStudents")
    public List<Student> findAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/findStudent/{id}")
    public Optional<Student> findStudentById(@PathVariable(value = "id") Long stdId){
        return studentService.getStudentById(stdId);
    }

    @PostMapping(value = "/addStudent")
    public void addNewStudent(@RequestBody com.example.java_crud_api_mysql.models.Student empObj){
        studentService.addNewStudent(empObj);
    }

    @PutMapping(value = "/updateStudent")
    public void updateNewStudent(@RequestBody Student empObj){
        studentService.updateStudentById(empObj);
    }

    @DeleteMapping(value = "/deleteStudent")
    public void deleteNewStudent(@RequestBody Student empObj){
        studentService.deleteStudentById(empObj);
    }
}
