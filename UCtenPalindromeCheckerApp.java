package com.palindromeApp;

/*
 @author developer
 @version 10.0
 */

public class UCtenPalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama"; // test string

        // Normalize: remove all whitespace and convert to lowercase
        String normalized_input = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int length = normalized_input.length();

        // Loop only till half
        for (int i = 0; i < length / 2; i++) {
            if (normalized_input.charAt(i) != normalized_input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
