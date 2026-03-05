package com.palindromeApp;

/*
 * @author developer
 * @version 13.0
 */

public class UCthirteenPalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Benchmark TwoPointerStrategy
        long start1 = System.nanoTime();
        boolean result1 = new TwoPointerStrategy().check(normalized);
        long end1 = System.nanoTime();
        System.out.println("TwoPointerStrategy result: " + result1 +
                           " executed in " + (end1 - start1) + " ns");

        // Benchmark StackStrategy
        long start2 = System.nanoTime();
        boolean result2 = new StackStrategy().check(normalized);
        long end2 = System.nanoTime();
        System.out.println("StackStrategy result: " + result2 +
                           " executed in " + (end2 - start2) + " ns");
    }
}