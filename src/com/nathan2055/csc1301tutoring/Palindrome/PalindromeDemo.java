package com.nathan2055.csc1301tutoring.Palindrome;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string to test: ");
        String inputString = input.nextLine();
        boolean isPalindrome = RecursivePalindrome.isPalindrome(inputString);
        System.out.println(isPalindrome);
    }
}
