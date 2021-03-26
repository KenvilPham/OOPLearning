package com.bt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        boolean exit = false;
        do {
            System.out.println("Input character from keyboard: ");
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("q") || input.toUpperCase().equals("Q")) {
                System.out.println("Exit program!");
                exit = true;
            } else if (input.matches("[0-9]+")) {
                integerArrayList.add(Integer.parseInt(input));
            }
        } while (!exit);

        Collections.sort(integerArrayList);

        System.out.println("List integer number input from keyboard is: ");
        integerArrayList.forEach(System.out::println);
    }
}
