package com.nathan2055.csc1301tutoring;

public class NestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
