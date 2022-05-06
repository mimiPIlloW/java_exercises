package com.java.exercises.practice.solution.basic_part1.ex37;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);
    }
}
