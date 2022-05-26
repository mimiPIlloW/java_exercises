package com.java.exercises.practice.solution.basic_part1.ex35;

import java.util.Scanner;

public class AreaOfAPolygon {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon");
        int nSide = scanner.nextInt();
        System.out.println("Input the length of one of the sides");
        int lSide = scanner.nextInt();

        double area = (nSide * Math.pow(lSide, 2)) / (4 * Math.tan(PI / nSide));
        System.out.println("The area is: " + area);
    }
}
