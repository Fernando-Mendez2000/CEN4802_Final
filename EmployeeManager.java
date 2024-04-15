package com.example.finalproject_cen4802c;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        // Add employee to the list
    }

    public List<Employee> getAllEmployees() {
        // Return all employees
        return employees;
    }

    public Employee getEmployeeById(int id) {
        // Find and return employee by id
        return null;
    }

    public void updateEmployee(int id, String name, String department) {
        // Update employee details
    }

    public void deleteEmployee(int id) {
        // Delete employee by id
    }
}