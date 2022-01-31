package com.java.testautomationu.chapter4;

import java.util.Scanner;

public class AverageTestScore {
    public static void main(String[] args) {

        int numberOfStudents = 24;
        int numbersOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;
            for (int j = 0; j < numbersOfTests; i++) {
                System.out.println("Enter the score for Test " + (j + 1));
                double score = scanner.nextDouble();
                total += score;
            }
            double average = total / numbersOfTests;
            System.out.println("The test avetage of student " + (i + 1) + " is " + average);
        }
    }
}
