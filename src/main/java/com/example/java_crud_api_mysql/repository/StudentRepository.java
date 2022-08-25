package com.example.java_crud_api_mysql.repository;

import com.example.java_crud_api_mysql.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}

