package com.pluralsight;


import java.util.Scanner;

public class FamousQuotesExercise {

    public static void main(String[] args) {

        String[] quotes = {
                "Wash your hands often",
                "Wear gloves",
                "Wipe everything down",
                "Bring spare clothes",
                "Wear masks",
                "Communicate with staff often",
                "Be ready to see some things",
                "Bring the stretcher with you",
                "Bring the med pack",
                "Ask of they need oxygen"
        };

        Scanner myScanner = new Scanner(System.in);
        //System.out.println("Pick a number 1 through 10 to see a quote");

        try {
            System.out.println(quotes[5]);
        }catch(Exception exception) {
            System.out.println("Oops!");
            exception.printStackTrace();
        }





















    }
}
