package com.nathan2055.csc1301tutoring;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] demoArray = new int[10];

        for (int i = 0; i < demoArray.length; i++) {
            demoArray[i] = i + 1;
        }

        System.out.println(Arrays.toString(demoArray));
    }
}
