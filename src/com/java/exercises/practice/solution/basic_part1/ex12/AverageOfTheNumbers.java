package com.java.exercises.practice.solution.basic_part1.ex12;

import java.util.Scanner;

public class AverageOfTheNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = scanner.nextInt();
        int secondN = scanner.nextInt();
        int thirdN = scanner.nextInt();

        int[] sumLength = {firstN,secondN,thirdN};
        int length = sumLength.length;

        int sum = firstN + secondN + thirdN;

        int average = sum / length;

        System.out.println(average);
    }
}
