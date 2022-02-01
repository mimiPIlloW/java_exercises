package com.java.exercises.practice.solution.sorting.ex2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSortingAlgorithm {

    void bubbleSort(int nums[]) {
        int n = nums.length;
        for (int a = 0; a < n - 1; a++)
            for (int b = 0; b < n - a - 1; b++)
                if (nums[b] > nums[b + 1]) {
                    int temp = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = temp;
                }
    }

    public static void main(String[] args) {
        BubbleSortingAlgorithm bubbleSortingAlgorithm = new BubbleSortingAlgorithm();
        int nums[] = {5, 87, 1, -6, 3, 9};
        bubbleSortingAlgorithm.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
