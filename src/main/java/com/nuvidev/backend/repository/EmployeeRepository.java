package com.nuvidev.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nuvidev.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  
}
