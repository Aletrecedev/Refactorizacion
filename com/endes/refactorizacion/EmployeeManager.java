package com.endes.refactorizacion;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, int years) {
        Employee newEmployee = new Employee(name, years);
        employees.add(newEmployee);
        System.out.println(name + " added to the system.");
    }

    public void printEmployees() {
        System.out.println("List of employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    
}
