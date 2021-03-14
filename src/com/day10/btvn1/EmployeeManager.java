package com.home.javabasic.day10.btvn1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();
    private int numberOfEmployees;

    public void writeInfoToFile() throws IOException {
        File myFile = new File("employees.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter(myFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        employeeArrayList.forEach(employee -> {
            try {
                bufferedWriter.write(employee.toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bufferedWriter.close();
        fileWriter.close();
    }

    public void inputEmployee() {
        System.out.println("Input number of employees: ");
        numberOfEmployees = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeArrayList.add(new Employee());
        }
        printAllEmployees();
    }

    public void printAllEmployees() {
        employeeArrayList.forEach(employee -> {
            System.out.println(employee.toString());
        });
    }

    public void insertEmployee(int position) {
        employeeArrayList.add(position, new Employee());
        printAllEmployees();
    }

    public void deleteEmployeeById(String id) {
        boolean removed = false;
        for (Employee employee : employeeArrayList) {
            if (employee.getId().equals(id)) {
                employeeArrayList.remove(employee);
                System.out.println("Removed employee with id: " + id);
                removed = true;
                break;
            }
        }
        if (removed) {
            printAllEmployees();
        } else {
            System.out.println("Can not find employee have id: " + id + " to remove");
        }
    }

    public void deleteEmployeeByName(String name) {
        boolean removed = false;
        for (Employee employee : employeeArrayList) {
            if (employee.getName().equals(name)) {
                employeeArrayList.remove(employee);
                System.out.println("Removed employee with id: " + name);
                removed = true;
                break;
            }
        }
        if (removed) {
            printAllEmployees();
        } else {
            System.out.println("Can not find employee have name: " + name + " to remove");
        }
    }

    public void changeEmployeeByName(String oldName, String newName) {
        boolean changed = false;
        for (Employee employee : employeeArrayList) {
            if (employee.getName().equals(oldName)) {
                employee.setName(newName);
                System.out.println("New name has been changed to: " + newName);
                changed = true;
                break;
            }
        }
        if (changed) {
            printAllEmployees();
        } else {
            System.out.println("Can not find employee have name: " + oldName + " to change");
        }
    }

    public int sizeOfEmployee(){
        return employeeArrayList.size();
    }
}
