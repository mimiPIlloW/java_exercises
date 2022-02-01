package com.java.exercises.practice.solution.string.ex_4;

public class UnicodeCodePoints {
    public static void main(String[] args) {
        String str = "w3rsource.com";

        int point = str.codePointCount(0, 9);

        System.out.println(point);
    }
}
