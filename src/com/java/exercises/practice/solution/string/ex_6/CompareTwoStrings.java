package com.java.exercises.practice.solution.string.ex_6;

public class CompareTwoStrings {
    public static void main(String[] args) {

        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";

        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("str1<str2");
        }else if (result>0){
            System.out.println("str1>str2");
        }else{
            System.out.println("str1 equal str2");
        }
    }
}
