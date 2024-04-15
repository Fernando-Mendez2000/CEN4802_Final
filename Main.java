package com.example.finalproject_cen4802c;
import java.util.ArrayList;
// Main.java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of EmployeeManager
        EmployeeManager manager = new EmployeeManager();

        // Add some employees
        manager.addEmployee(new Employee(1, "John Doe", "IT"));
        manager.addEmployee(new Employee(2, "Jane Smith", "HR"));

        // Retrieve and display all employees
        List<Employee> allEmployees = manager.getAllEmployees();
        System.out.println("All Employees:");
        for (Employee employee : allEmployees) {
            // Display employee information (name and department)
            System.out.println(employee.getName() + " - " + employee.getDepartment());
        }

        // Update an employee
        manager.updateEmployee(1, "John Doe Jr.", "IT");
        System.out.println("Updated employee with id 1");

        // Delete an employee
        manager.deleteEmployee(2);
        System.out.println("Deleted employee with id 2");

        // Display all employees after update and delete
        System.out.println("\nAll Employees after update and delete:");
        for (Employee employee : manager.getAllEmployees()) {
            System.out.println(employee.getName() + " - " + employee.getDepartment());
        }
    }
}

