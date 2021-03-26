package com.bt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static int inputNumber(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int n = 0;

        do {
            System.out.printf("Input number with %d < number < %d: ", min, max);
            String input = scanner.nextLine();
            if (!input.matches("^-?\\d+$")) {
                System.out.println("You should input integer number! Please try again!");
            } else {
                n = Integer.parseInt(input);
                if (n <= min || n >= max) {
                    System.out.printf("Please input %d < number < %d\n", min, max);
                } else {
                    exit = true;
                }
            }
        }while (!exit);

        return n;
    }

    public static int[] generateRandom(){
        int arraySize = inputNumber(8, 14);
        int[] arr = new int[arraySize];
        Random rd = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = rd.nextInt(21) - 10;
        }

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        return arr;
    }

    public static int findClosestSum(int[] arr, int numberCheck) {
        int closestSum = 10000;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int sum = arr[leftIndex] + arr[rightIndex];
            if (Math.abs(numberCheck - sum) < Math.abs(numberCheck - closestSum)) {
                closestSum = sum;
            }
            if (sum > numberCheck) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }
        return closestSum;
    }
    public static void findTwoNumber(int[] arr, int x) {
        Arrays.sort(arr);
        int closestSum = findClosestSum(arr, x);
        System.out.println("Closest is: " + closestSum);

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == closestSum) {
                System.out.printf("Two number is: %d & %d", arr[left], arr[right]);
                System.out.println();
            }
            if (sum > closestSum) {
                right--;
            } else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--------Input array number--------");
        int[] arr = generateRandom();
        System.out.println("--------Input number to check--------");
        int checkNumber = inputNumber(-11, 11);
        findTwoNumber(arr, checkNumber);
    }
}
