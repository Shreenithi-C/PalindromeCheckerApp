package com.palindromeApp;

/*
 * @author developer
 * @version 12.0
 */

public class UCtwelvePalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam"; // test string

        // Choose strategy dynamically
        PalindromeStrategy strategy = new TwoPointerStrategy(); 

        if (strategy.check(input)) {
            System.out.println(input + " is a palindrome (using " + strategy.getClass().getSimpleName() + ").");
        } else {
            System.out.println(input + " is not a palindrome (using " + strategy.getClass().getSimpleName() + ").");
        }
    }
}