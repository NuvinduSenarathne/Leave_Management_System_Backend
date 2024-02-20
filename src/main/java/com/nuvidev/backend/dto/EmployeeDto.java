package com.nuvidev.backend.dto;

public class EmployeeDto {

    private String employeeName;

    private String employeeContactNumber;

    private String employeeAddress;

    private String employeeGender;

    private String employeeDepartment;

    private String employeeSkill;

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
