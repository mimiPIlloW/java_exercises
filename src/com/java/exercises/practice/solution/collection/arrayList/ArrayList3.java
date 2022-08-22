package com.java.exercises.practice.solution.collection.arrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        arrayList.add(0,"6");

        System.out.println(arrayList);
    }
}
