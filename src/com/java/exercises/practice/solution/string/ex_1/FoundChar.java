package com.java.exercises.practice.solution.string.ex_1;

import java.util.Scanner;

public class FoundChar {
    public static void main(String[] args) {

        System.out.println("Given index within the String");
        System.out.println("Write the text");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println("write the index 1");
        int ind1 = scanner.nextInt();

        System.out.println("write the index 2");
        int ind2 = scanner.nextInt();

        int resultInd1 = str.charAt(ind1);
        int resultInd2 = str.charAt(ind2);

        System.out.println("The character at position " + ind1 + " is " + (char) resultInd1);
        System.out.println("The character at position " + ind2 + " is " + (char) resultInd2);
    }
}

