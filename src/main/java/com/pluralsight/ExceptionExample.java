package com.pluralsight;

public class ExceptionExample {

    public static void main(String[] args) {
        String[] students = {"Mario", "Malika", "Nam Kiet", "Mateo"};

        try {
            System.out.println(students[7]);
        }catch(Exception exception) {
            System.out.println("Oops!");
            exception.printStackTrace();
        }
    }
}
