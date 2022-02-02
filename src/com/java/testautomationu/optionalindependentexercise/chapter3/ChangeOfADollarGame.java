package com.java.testautomationu.optionalindependentexercise.chapter3;

import java.util.Scanner;

public class ChangeOfADollarGame {

    public static void main(String[] args) {

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int pPenny = scanner.nextInt();

        System.out.println();
        int pNickel = scanner.nextInt();

        System.out.println();
        int pDime = scanner.nextInt();

        System.out.println();
        int pQuarter = scanner.nextInt();

        double result = pPenny * penny + pNickel * nickel + pDime * dime + pQuarter * quarter;

        if (result < dollar) {
            System.out.println("Sorry");
        } else if (result > dollar) {
            System.out.println("Sorry");
        } else {
            System.out.println("You win");
        }
    }
}
