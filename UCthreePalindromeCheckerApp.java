package com.palindromeApp;

public class UCthreePalindromeCheckerApp {
	public static void main(String[] args) {
	String word = "level"; // test string 
	String reversed = ""; 
	// Reverse using loop 
	for (int i = word.length() - 1; i >= 0; i--) 
	{ 
		reversed += word.charAt(i); 
	} 
	// Compare original and reversed 
	if (word.equals(reversed)) { 
		System.out.println(word + " is a palindrome."); 
	} 
	else { 
		System.out.println(word + " is not a palindrome."); 
	} 
  } 
}
