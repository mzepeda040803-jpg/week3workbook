package com.pluralsight;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Catrina");
        students.add("Nam Kiet");
        students.add("Fatinur");
        students.add("Mario");
        System.out.println(students);
        for (String student: students) {
            System.out.println(student);
        }
    }
}
