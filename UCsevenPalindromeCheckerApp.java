package com.palindromeApp;

import java.util.ArrayDeque;
import java.util.Deque;

public class UCsevenPalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer"; // test string

        if (isPalindromeUsingDeque(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindromeUsingDeque(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        // Compare front and rear until one or zero elements remain
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false; // mismatch found
            }
        }

        return true; // all matched
    }
}
