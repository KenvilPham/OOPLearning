package com.day14;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherManager extends PersonManager {
    public void sortBySalary(List<Teacher> list) {
        list.sort((o1, o2) -> {
            if (Math.abs(o1.getSalary() - o2.getSalary()) < EPSILON) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSalary() > o2.getSalary() ? 1 : -1;
            }
        });

        printArray(list);
    }

    public void findMaxSalary(List<Teacher> list) {
        double maxSalary = list.stream()
                .max(Comparator.comparing(Teacher::getSalary))
                .get()
                .getSalary();
        List<Teacher> teacherList = list.stream()
                .filter(teacher -> Math.abs(teacher.getSalary() - maxSalary) < EPSILON)
                .collect(Collectors.toList());
        printArray(teacherList);
    }
}
