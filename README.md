# PalindromeCheckerApp

## 📖 Overview
This repository demonstrates **13 different approaches** to solving the classic palindrome problem in Java.  
The objective of tApp is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.
Each use case builds on the previous one, introducing new concepts: from simple loops to advanced object-oriented design patterns and performance benchmarking.

---

## 🚀 Use Cases

### UC1: Basic Hardcoded Palindrome
- Hardcoded string check.
- Simple loop and character comparison.

### UC2: Single-Function Palindrome
- All logic inside `main()`.
- Minimal structure, no helper methods.

### UC3: User Input Palindrome
- Accepts input via `Scanner`.
- Demonstrates console input handling.

### UC4: StringBuilder Reverse
- Uses `StringBuilder.reverse()` for palindrome check.
- Leverages built-in Java utilities.

### UC5: Stack-Based Palindrome
- Pushes characters into a `Stack`.
- Compares using LIFO behavior.

### UC6: Queue + Stack Palindrome
- Inserts characters into both `Queue` (FIFO) and `Stack` (LIFO).
- Compares outputs for palindrome validation.

### UC7: Deque-Based Palindrome
- Uses `Deque` to remove characters from both ends.
- Efficient symmetry check.

### UC8: LinkedList-Based Palindrome
- Uses `LinkedList` operations (`removeFirst`, `removeLast`).
- Demonstrates linked list usage.

### UC9: Recursive Palindrome
- Checks palindrome using recursion.
- Base case and recursive inward comparison.

### UC10: Normalized Palindrome
- Handles spaces and case sensitivity.
- Uses regex (`replaceAll("\\s+", "")`) and lowercase conversion.

### UC11: Object-Oriented Palindrome Service
- Encapsulates palindrome logic in a service class.
- Demonstrates encapsulation and separation of concerns.

### UC12: Strategy Pattern
- Defines a `PalindromeStrategy` interface.
- Implements interchangeable algorithms (Stack, Two-Pointer).
- Demonstrates the Strategy Design Pattern.

### UC13: Performance Comparison
- Benchmarks different strategies using `System.nanoTime()`.
- Compares execution times for efficiency analysis.

---

## 📂 Project Structure
