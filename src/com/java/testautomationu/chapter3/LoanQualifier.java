package com.java.testautomationu.chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {

        int requiresSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();
        scanner.close();

        if (salary >= requiresSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats");
            } else {
                System.out.println("Sorry");
            }
        } else {
            System.out.println("Sorry");
        }
    }
}
