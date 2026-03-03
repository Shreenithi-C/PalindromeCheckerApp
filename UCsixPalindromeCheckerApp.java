package com.palindromeApp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UCsixPalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic"; // test string

        if (isPalindromeUsingQueueAndStack(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindromeUsingQueueAndStack(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : str.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        // Compare characters from queue and stack
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false; // mismatch found
            }
        }

        return true; // all matched
    }
}

