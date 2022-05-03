package com.java.exercises.practice.solution.basic_part2.ex152;

import java.util.Arrays;
import java.util.Random;

public class PrintEqual {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        boolean f = true;

        Random random = new Random();

        int[] array = new int[4];
        array[0] = random.nextInt(a, b);
        System.out.println(array[0]);
        array[1] = random.nextInt(a, b);
        System.out.println(array[1]);
        array[2] = random.nextInt(a, b);
        System.out.println(array[2]);
        array[3] = random.nextInt(a, b);
        System.out.println(array[3]);

        while (f) {
            int e = array.length;
            for (int c = 0; c < e - 1; c++) {
                for (int d = 0; d < e - c - 1; d++) {
                    if (array[d] == array[d + 1]) {
                        System.out.println("Numbers are equal");
                        f = false;
                    } else if (array[d] > array[d + 1] || array[d] < array[d + 1]){
                        int temp = array[d];
                        array[d] = array[d + 1];
                        array[d + 1] = temp;
                        System.out.println("Numbers are not equal");
                    }else {
                        break;
                    }
                }
            }
        }
    }
}
// if 1 coincidence == 1 Numbers are equal
// if 1 coincidence && else 1 coincidence == 2 Numbers are equal
// if 3 coincidence == 3 Numbers are equal
// if 4 coincidence == 4 Numbers are equal