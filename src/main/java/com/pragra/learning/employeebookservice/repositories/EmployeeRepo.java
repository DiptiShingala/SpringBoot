package com.pragra.learning.employeebookservice.repositories;

import com.pragra.learning.employeebookservice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
