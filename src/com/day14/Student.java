package com.day14;

public class Student extends Person {
    private double gpa;

    public Student(String id, String name, int age, String address, double gpa) {
        super(id, name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + gpa;
    }
}
