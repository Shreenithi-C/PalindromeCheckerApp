package com.palindromeApp;

/*
@author developer
@version 6.0
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UCsixPalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic"; // test string

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        boolean isPalindrome = true;

        // Compare characters from queue and stack
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
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
