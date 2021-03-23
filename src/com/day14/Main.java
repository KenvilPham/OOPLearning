package com.day14;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        TeacherManager teacherManager = new TeacherManager();

        List<Student> studentList = Arrays.asList(
                new Student("st1", "Pham Van A", 19, "Ha Noi", 3.9),
                new Student("st2", "Pham Van B", 19, "Ninh Binh", 3.9),
                new Student("st3", "Thai Van C", 20, "Thai Nguyen", 2.5),
                new Student("st4", "Tran Van D", 21, "Bac Ninh", 3.7),
                new Student("st5", "Nguyen Van E", 22, "Ha Giang", 3.1)
        );

        List<Teacher> teacherList = Arrays.asList(
                new Teacher("t1", "Pham Van F", 19, "Ha Noi", 3.9),
                new Teacher("t2", "Pham Van G", 19, "Ninh Binh", 3.9),
                new Teacher("t3", "Thai Van H", 20, "Thai Nguyen", 2.5),
                new Teacher("t4", "Tran Van I", 21, "Bac Ninh", 3.7),
                new Teacher("t5", "Nguyen Van K", 22, "Ha Giang", 3.1)
        );

        System.out.println("Student information: ");
        studentManager.printArray(studentList);

        System.out.println("Student sorted by name: ");
        studentManager.sortByName(studentList);

        System.out.println("Student sorted by GPA: ");
        studentManager.sortByGPA(studentList);

        System.out.println("--------------------------------------");

        System.out.println("Teacher information: ");
        teacherManager.printArray(teacherList);

        System.out.println("Teacher sorted by name: ");
        teacherManager.sortByName(teacherList);

        System.out.println("Teacher sorted by salary: ");
        teacherManager.sortBySalary(teacherList);

        System.out.println("List of teacher have highest salary: ");
        teacherManager.findMaxSalary(teacherList);
    }
}
