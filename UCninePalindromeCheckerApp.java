package com.palindromeApp;

/*
@author developer
@version 9.0
*/

public class UCninePalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar"; // test string

        boolean isPalindrome = checkRecursive(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    private static boolean checkRecursive(String s, int start, int end) {
        // Base case: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If mismatch found, return false
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return checkRecursive(s, start + 1, end - 1);
    }
}
