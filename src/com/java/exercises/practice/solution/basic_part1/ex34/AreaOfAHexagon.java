package com.java.exercises.practice.solution.basic_part1.ex34;

import java.util.Scanner;

public class AreaOfAHexagon {
    static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lengthOfASide = scanner.nextDouble();

        double area = (6 * lengthOfASide * lengthOfASide / (4 * Math.tan(PI / 6)));
        System.out.println(area);
    }
}
