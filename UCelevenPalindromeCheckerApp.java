package com.palindromeApp;

/*
 * @author Developer
 * @version 11.0
*/

public class UCelevenPalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam"; // test string

        PalindromeService service = new PalindromeService();

        if (service.checkPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // mismatch found
            }
            start++;
            end--;
        }

        return true; // all matched
    }
}

