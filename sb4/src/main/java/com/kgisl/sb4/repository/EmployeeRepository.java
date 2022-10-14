package com.kgisl.sb4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.sb4.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
}
