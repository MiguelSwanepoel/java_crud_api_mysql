package com.example.java_crud_api_mysql.controller;

import com.example.java_crud_api_mysql.Student;
import com.example.java_crud_api_mysql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    // END POINT TO FETCH ALL EMPLOYEES
    @GetMapping(value = "/allStudents")
    public List<Student> findAllStudents(){
        return studentService.getAllStudents();
    }

    // END POINT TO FETCH SINGLE EMPLOYEE
    @GetMapping(value = "/findStudent/{id}")
    public Optional<Student> findStudentById(@PathVariable(value = "id") Long stdId){
        return studentService.getStudentById(stdId);
    }

    // END POINT TO ADD NEW EMPLOYEE
    @PostMapping(value = "/addStudent")
    public void addNewStudent(@RequestBody com.example.java_crud_api_mysql.Student empObj){
        studentService.addNewStudent(empObj);
    }

    // END POINT TO UPDATE AN EMPLOYEE
    @PutMapping(value = "/updateStudent")
    public void updateNewStudent(@RequestBody Student empObj){
        studentService.updateStudentById(empObj);
    }

    // END POINT TO DELETE AN EMPLOYEE
    @DeleteMapping(value = "/deleteStudent")
    public void deleteNewStudent(@RequestBody Student empObj){
        studentService.deleteStudentById(empObj);
    }
}
