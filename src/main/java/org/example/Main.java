package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        Healthplan healthplan = new Healthplan(1, "Gold Plan", Plan.PREMIUM);


        String[] healthplans = new String[5];
        Employee employee = new Employee(101, "John Doe", "john.doe@example.com", "password123", healthplans);


        String[] developers = new String[3];
        Company company = new Company(1, "Tech Corp", 1000000, developers);


        employee.addHealthPlan(0, "Health Plan A");


        company.addEmployee(0, "Developer 1");


        System.out.println(healthplan.toString());
        System.out.println(employee.toString());
        System.out.println(company.toString());
    }
}
