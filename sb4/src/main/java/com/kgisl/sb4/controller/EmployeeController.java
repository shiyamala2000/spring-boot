package com.kgisl.sb4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.sb4.model.Employee;
import com.kgisl.sb4.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public List<Employee> getAllEmployees(){
       return  employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
     return   employeeRepository.findById(id);
    }
  
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeRepository.deleteById(id);
    }

    @PostMapping("/")
    public Employee insertEmployee(@RequestBody Employee e){
       return  employeeRepository.save(e);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee e,@PathVariable int id){
     return  employeeRepository.save(e);
    }
}
