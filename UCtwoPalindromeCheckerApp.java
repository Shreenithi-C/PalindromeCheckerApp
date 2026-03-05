package com.palindromeApp;

public class UCtwoPalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "malayalam"; // hardcoded string
        int length = word.length();
        boolean isPalindrome = true;

        // Loop only till half
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

