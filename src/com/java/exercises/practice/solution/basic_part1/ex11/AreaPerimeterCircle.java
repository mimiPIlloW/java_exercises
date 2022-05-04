package com.java.exercises.practice.solution.basic_part1.ex11;

public class AreaPerimeterCircle {
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        double radiusCircle = 7.5;

        double areaCircle = PI * (radiusCircle * radiusCircle);
        double perimeterCircle = 2 * (PI * radiusCircle);

        System.out.println(areaCircle);
        System.out.println(perimeterCircle);
    }
}
