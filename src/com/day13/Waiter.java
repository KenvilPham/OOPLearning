package com.day13;

public class Waiter extends Employee {
    private double compensate;

    public Waiter(String id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    @Override
    protected double calculatorSalary() {
        return compensate + basicSalary;
    }

    @Override
    public String toString() {
        return super.toString() + " - Bonus compensate: " + compensate;
    }
}
