package com.palindromeApp;
import java.util.Stack;

public class UCfivePalindromeCheckerApp {
	
    public static void main(String[] args) {
        String input = "noon"; // test string

        if (isPalindromeUsingStack(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindromeUsingStack(String str) {
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping from stack 
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false; // mismatch found
            }
        }

        return true; // all matched
    }
}
