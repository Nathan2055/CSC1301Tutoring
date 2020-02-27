package com.nathan2055.csc1301tutoring;

public class NestedForSpaces {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 6; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
