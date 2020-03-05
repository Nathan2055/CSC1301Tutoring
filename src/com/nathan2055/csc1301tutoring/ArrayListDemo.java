package com.nathan2055.csc1301tutoring;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> demoList = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            demoList.add(i);
        }

        String printable = Arrays.toString(demoList.toArray());
        System.out.println(printable);
    }
}
