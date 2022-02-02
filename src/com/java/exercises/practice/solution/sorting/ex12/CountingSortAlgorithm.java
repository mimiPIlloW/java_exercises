package com.java.exercises.practice.solution.sorting.ex12;

import java.util.Arrays;

public class CountingSortAlgorithm {

    public void countingSort(int numb[], int min, int max) {
        int ctr[] = new int[max - min + 1];
        for (int number : numb) {
            ctr[number - min]++;
        }
        int z = 0;
        for (int i = min; i <= max; i++) {
            while (ctr[i - min] > 0) {
                numb[z] = i;
                z++;
                ctr[i - min]--;
            }
        }
    }

    public static void main(String[] args) {
        CountingSortAlgorithm countingSortAlgorithm = new CountingSortAlgorithm();
        int numb[] = {15, 3, 98, 2, -5, 1, -12};
        int minValue = -12, maxValue = 98;
        countingSortAlgorithm.countingSort(numb, minValue, maxValue);
        System.out.println(Arrays.toString(numb));
    }
}
