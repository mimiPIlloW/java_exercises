package com.java.exercises.practice.solution.string.ex_8;

public class TestGivenString {
    public static void main(String[] args) {
        String str = "PHP Exercises and Python Exercises";

        int indexJava = str.indexOf("and");
        if (indexJava == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found in the index: " + indexJava);
        }
    }
}
