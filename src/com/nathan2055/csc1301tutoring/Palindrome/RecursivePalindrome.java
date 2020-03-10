package com.nathan2055.csc1301tutoring.Palindrome;

public class RecursivePalindrome {
    public static boolean isPalindrome(String toCheck) {
        int length = toCheck.length();
        int length1 = (length - 1);
        char[] checkArray = toCheck.toCharArray();
        if (length > 2) {
            String substring = toCheck.substring(1, length1);
            if (checkArray[0] == checkArray[length1]) {
                if (isPalindrome(substring)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (length == 2) {
            if (checkArray[0] == checkArray[1]) {
                return true;
            } else {
                return false;
            }
        } else if (length == 1) {
            return true;
        } else {
            return false;
        }
    }
}
