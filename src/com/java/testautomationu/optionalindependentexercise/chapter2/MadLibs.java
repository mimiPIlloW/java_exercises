package com.java.testautomationu.optionalindependentexercise.chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("season of the year");
        String season = scanner.next();

        System.out.println("whole number");
        int number = scanner.nextInt();

        System.out.println("an adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println(season + " " + number + " " + adjective);
    }
}
