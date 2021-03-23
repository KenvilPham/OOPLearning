package com.day14;

import java.util.List;

public class StudentManager extends PersonManager{

    public void sortByGPA(List<Student> list) {
        list.sort((o1, o2) -> {
            if (Math.abs(o1.getGpa() - o2.getGpa()) < EPSILON) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getGpa() > o2.getGpa() ? 1 : -1;
            }
        });

        printArray(list);
    }

}
