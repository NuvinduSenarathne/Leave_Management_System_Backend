package com.nuvidev.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeID;

    private String employeeName;

    private String employeeContactNumber;

    private String employeeAddress;

    private String employeeGender;

    private String employeeDepartment;

    private String employeeSkill;

    public Employee() {
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeContactNumber() {
        return employeeContactNumber;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public String getEmployeeSkill() {
        return employeeSkill;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeContactNumber(String employeeContactNumber) {
        this.employeeContactNumber = employeeContactNumber;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void setEmployeeSkill(String employeeSkill) {
        this.employeeSkill = employeeSkill;
    }

}
