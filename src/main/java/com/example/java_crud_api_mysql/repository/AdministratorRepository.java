package com.example.java_crud_api_mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java_crud_api_mysql.models.Administrator;


@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {


}
