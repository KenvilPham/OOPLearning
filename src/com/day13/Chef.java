package com.day13;

public class Chef extends Employee {
    private double serviceCharge;

    public Chef(String id, String name, int age, double basicSalary, double serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    @Override
    protected double calculatorSalary() {
        return serviceCharge + basicSalary;
    }

    @Override
    public String toString() {
        return super.toString() + " - Service charge: " + serviceCharge;
    }
}
