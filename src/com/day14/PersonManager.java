package com.day14;

import java.util.Comparator;
import java.util.List;

public abstract class PersonManager {
    public final static double EPSILON = 0.001;

    public void printArray(List<? extends Person> list) {
        list.forEach(System.out::println);
    }

    public void sortByName(List<? extends Person> list) {
        list.sort(Comparator.comparing(Person::getName));
        printArray(list);
    }
}
