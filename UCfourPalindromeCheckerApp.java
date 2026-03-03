package com.palindromeApp;

public class UCfourPalindromeCheckerApp {
	public static void main(String[] args)
	{
		String word = "racecar"; // test string 
		char[] chars = word.toCharArray(); 
		int left = 0, right = chars.length - 1; 
		boolean isPalindrome = true; 
		while (left < right) 
		{ 
			if (chars[left] != chars[right]) 
			{ 
				isPalindrome = false; 
				break; 
			} 
			left++; 
			right--; 
		} 
		if (isPalindrome) 
		   { 
			   System.out.println(word + " is a palindrome.");
		   } 
		else
		   { 
			   System.out.println(word + " is not a palindrome.");
		   } 
	}
}

