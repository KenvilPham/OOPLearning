package com.home.javabasic.day10.btvn1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.inputEmployee();

        boolean exit = false;

        do {
            System.out.println("---------------Choose menu---------------" +
                    "\n1 - Insert employee" +
                    "\n2 - Remove employee by ID" +
                    "\n3 - Remove employee by name" +
                    "\n4 - Change name of employee" +
                    "\nOther to exit program" +
                    "\n-----------------------------------------");
            int chooser = Integer.parseInt(sc.nextLine());

            switch (chooser) {
                case 1:
                    System.out.println("Input position need to insert employee information(0 <= position <= " + employeeManager.sizeOfEmployee() + "): ");
                    int position = Integer.parseInt(sc.nextLine());
                    employeeManager.insertEmployee(position);
                    break;
                case 2:
                    System.out.println("Input id of employee need to remove: ");
                    String id = sc.nextLine();
                    employeeManager.deleteEmployeeById(id);
                    break;
                case 3:
                    System.out.println("Input name of employee need to remove: ");
                    String name = sc.nextLine();
                    employeeManager.deleteEmployeeByName(name);
                    break;
                case 4:
                    System.out.println("Input name of employee need to change: ");
                    String oldName = sc.nextLine();
                    System.out.println("Input new name: ");
                    String newName = sc.nextLine();
                    employeeManager.changeEmployeeByName(oldName, newName);
                    break;
                default:
                    System.out.println("Write all employees information to file employees.txt");
                    employeeManager.writeInfoToFile();
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
