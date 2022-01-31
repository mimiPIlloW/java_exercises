package com.java.testautomationu.chapter3;

import java.util.Scanner;

public class TestResult1 {
    public static void main(String[] args) {

        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String massage;

        switch (grade) {
            case "A":
                massage = "Excellent job!";
                break;
            case "B":
                massage = "Great job";
                break;
            case "C":
                massage = "Good job";
                break;
            case "D":
                massage = "You need to work";
                break;
            case "F":
                massage = "Uh oh";
                break;
            default:
                massage = "Error.";
                break;
        }

        System.out.println(grade + " " + massage);
    }
}
