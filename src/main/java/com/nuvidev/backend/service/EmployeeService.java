package com.nuvidev.backend.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuvidev.backend.dto.EmployeeDto;
import com.nuvidev.backend.exception.EmployeeException;
import com.nuvidev.backend.model.Employee;
import com.nuvidev.backend.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeException("Employee not found with id: " + id));
    }

    public Employee updateEmployee(Integer id, EmployeeDto employeeDto) {
        Employee existingEmployee = getEmployeeById(id);
        BeanUtils.copyProperties(employeeDto, existingEmployee);
        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
    
    
}
