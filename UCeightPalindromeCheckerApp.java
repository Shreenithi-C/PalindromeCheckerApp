package com.palindromeApp;

import java.util.LinkedList;

public class UCeightPalindromeCheckerApp{
    public static void main(String[] args) {
        String input = "level"; // test string

        if (isPalindromeUsingLinkedList(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindromeUsingLinkedList(String str) {
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        // Compare front and rear until one or zero elements remain
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false; // mismatch found
            }
        }

        return true; // all matched
    }
}
