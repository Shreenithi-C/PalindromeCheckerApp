package com.palindromeApp;

public class UCninePalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar"; // test string

        if (isPalindromeRecursive(input, 0, input.length() - 1)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    //Recursively checks whether a string is a palindrome.
 
    private static boolean isPalindromeRecursive(String s, int start, int end) {
        // Base case: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If mismatch found, return false
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return isPalindromeRecursive(s, start + 1, end - 1);
    }
}

