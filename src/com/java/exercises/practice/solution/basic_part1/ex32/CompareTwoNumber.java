package com.java.exercises.practice.solution.basic_part1.ex32;

import java.util.Scanner;

public class CompareTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println(a + "==" + b);
        }
        if (a != b) {
            System.out.println(a + "!=" + b);
        }
        if (a < b) {
            System.out.println(a + "<" + b);
        }
        if (a > b) {
            System.out.println(a + ">" + b);
        }
        if (a <= b) {
            System.out.println(a + "<=" + b);
        }
        if (a >= b) {
            System.out.println(a + ">=" + b);
        }
    }
}
