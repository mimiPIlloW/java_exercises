package com.java.exercises.practice.solution.string.ex_2;

public class UnicodeCodePoint {
    public static void main(String[] args) {
        String str = "w3resource.com";

        int ind1 = str.codePointAt(1);
        int ind2 = str.codePointAt(2);

        System.out.println(ind1);
        System.out.println(ind2);
    }
}
