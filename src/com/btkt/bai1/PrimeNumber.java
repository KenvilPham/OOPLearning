package com.btkt.bai1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        File logFile = new File("log.txt");
        logFile.createNewFile();
        FileWriter fileWriter = new FileWriter(logFile,true);

        boolean exit = false;
        do {
            System.out.println("Input number to check: ");
            String input = scanner.nextLine();
            fileWriter.write("Input number: " + input + "\n");

            if (input.toUpperCase().equals("X") || input.toUpperCase().equals("Q")) {
                fileWriter.write("Exit program\n");
                exit = true;
            } else if (!input.matches("[0-9]+")){
                System.out.println(input+" is not positive integer number. Please input number again");
                fileWriter.write(input +" is not positive integer number. Please input number again\n");
            } else {
                int number = Integer.parseInt(input);
                if (isPrimeNumber(number)) {
                    System.out.println(number + " is prime number");
                    fileWriter.write(number + " is prime number" + "\n");
                } else {
                    System.out.println(number + " is not prime number");
                    fileWriter.write(number + " is not prime number" + "\n");
                }
            }
        } while (!exit);
        fileWriter.close();
    }
}
