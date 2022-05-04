package com.java.exercises.practice.solution.basic_part1.ex15;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = 6;
        int b = 36;
        System.out.println("A, B" + "= " + a + ", " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A, B" + "= " + a + ", " + b);
    }
}
