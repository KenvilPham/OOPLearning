package com.home.javabasic.day10.btvn1;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private String role;
    private String address;
    private double salary;

    private Scanner scanner = new Scanner(System.in);

    public Employee(String id, String name, String role, String address, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
        inputInfo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void inputInfo() {
        System.out.println("Input information of employee: ");
        System.out.println("ID: ");
        id = scanner.nextLine();
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Role: ");
        role = scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Salary: ");
        salary = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return String.format("%3s %10s %8s %12s %12.2f", id, name, role, address, salary);
    }
}
