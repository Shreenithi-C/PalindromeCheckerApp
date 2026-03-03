package com.palindromeApp;

public class UCtwoPalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "Malayalam"; // hardcoded string

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) { 
    	int length = str.length(); 
    	for (int i = 0; i < length / 2; i++) 
    	{ 
    		if (str.charAt(i) != str.charAt(length - 1 - i)) 
    		{ 
    			return false; 
    		}
    	}
    	return true;
    }
}
