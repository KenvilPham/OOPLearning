package com.codeschool;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        PeriodicTable table = new PeriodicTable();
        table.findByWeight.apply(50d, 60d)
                .forEach(System.out::println);
        table.listAllElements();
    }
}
