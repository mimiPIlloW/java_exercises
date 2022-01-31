package com.java.testautomationu.chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employers");
        double years = scanner.nextDouble();

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats");
        } else {
            System.out.println("Sorry " + requiredSalary + " loan");
        }
    }
}
