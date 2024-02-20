package com.nuvidev.backend.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nuvidev.backend.dto.EmployeeDto;
import com.nuvidev.backend.model.Employee;
import com.nuvidev.backend.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/")
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>("{\"message\": \"Employee created successfully!\"}", HttpStatus.OK);
    }

    @GetMapping("/employee/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable Integer employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PutMapping("employee/{employeeId}")
    public ResponseEntity<String> updateEmployee(@PathVariable Integer employeeId, @RequestBody EmployeeDto employeeDto) {
        employeeService.updateEmployee(employeeId, employeeDto);
        return new ResponseEntity<>("{\"message\": \"Employee updated successfully!\"}", HttpStatus.OK);
    }

    @DeleteMapping("employee/{employeeId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer employeeId) {
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity<>("{\"message\": \"Employee deleted successfully!\"}", HttpStatus.OK);
    }
      
}
