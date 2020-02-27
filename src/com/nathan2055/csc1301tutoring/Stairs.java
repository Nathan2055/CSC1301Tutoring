package com.nathan2055.csc1301tutoring;

public class Stairs {
    public static void main(String[] args) {
        // Number of stairs to be printed
        final int stairCount = 5;

        // Print each stair
        for (int i = 1; i <= stairCount; i++) {
            // First line of stair
            for (int a = stairCount; a > i; a--) {
                System.out.print("      ");
            }
            System.out.print("  o  ******");
            if (i > 1) {
                System.out.print("*");
            }
            for (int a = 1; a < (i); a++) {
                System.out.print("     ");
            }
            if (i > 1) {
                for (int a = 1; a < (i-1); a++) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");

            // Second line of stair
            for (int a = stairCount; a > i; a--) {
                System.out.print("      ");
            }
            System.out.print(" /|\\ *     ");
            for (int a = 1; a < (i); a++) {
                System.out.print("      ");
            }
            System.out.println("*");

            // Third line of stair
            for (int a = stairCount; a > i; a--) {
                System.out.print("      ");
            }
            System.out.print(" / \\ *     ");
            for (int a = 1; a < (i); a++) {
                System.out.print("      ");
            }
            System.out.println("*");
        }

        // Print floor
        System.out.print("*****");
        for (int i = 1; i <= stairCount; i++) {
            System.out.print("******");
        }
        System.out.println("*");
    }
}
