package com.day13;

public abstract class Employee {
    protected String id;
    protected String name;
    protected int age;
    protected double basicSalary;

    public Employee(String id, String name, int age, double basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    protected abstract double calculatorSalary();

    @Override
    public String toString() {
        return String.format("ID: %s - Name: %s - Age: %d - Basic salary: %.2f - Real salary: %.2f", id, name, age, basicSalary, this.calculatorSalary());
    }
}
