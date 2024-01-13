package com.pragra.learning.employeebookservice.controllers;

import com.pragra.learning.employeebookservice.repositories.EmployeeRepo;
import com.pragra.learning.employeebookservice.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController
{
    @Autowired
    EmployeeRepo employeeRepo;
    @GetMapping("/all")
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        employeeRepo.save(employee);
        //employee.setFirstName(employee.getFirstName() + employee.getFirstName());
        return employee;
    }


}
