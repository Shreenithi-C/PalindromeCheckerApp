package com.palindromeApp;

/*
@author developer
@version 7.0
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class UCsevenPalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer"; // test string
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear until one or zero elements remain
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
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
