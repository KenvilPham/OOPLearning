package com.day13;

import java.util.Arrays;
import java.util.List;

public class EmployeeManager {

    public static void printArray(List<? extends Employee> lists) {
        lists.forEach(employee -> System.out.println(employee));
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Waiter("wt_1", "Pham Duc Sang", 23, 20000000, 2000000),
                new Waiter("wt_2", "Tran Duc Thang", 27, 25000000, 800000),
                new Waiter("wt_3", "Nguyen Van Duc", 28, 29000000, 900000),
                new Chef("ch_1", "Pham Duc A", 33, 31000000, 3700000),
                new Chef("ch_2", "Tran Duc B", 37, 20500000, 2070000),
                new Chef("ch_3", "Nguyen Van C", 38, 26000000, 1500000));

        printArray(employees);
    }
}
