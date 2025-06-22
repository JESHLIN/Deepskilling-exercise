1. Understand Recursive Algorithms

* Recursion is a technique where a method calls itself to solve a smaller instance of the same problem.

* It helps simplify problems that have a repetitive, self-similar structure (e.g., Fibonacci, factorial).

* Every recursive function has:

* A base case – the condition to stop recursion.

* A recursive case – the part where the function calls itself with modified parameters.

* Useful in financial modeling where future values are derived from past trends.

2. Setup – Define the Problem

Goal: Predict future value (FV) based on:

* initial value (PV)

* growth rate (r%)

* number of periods (n)

* Formula (compound growth): FV = PV × (1 + r)^n

3. Analysis

Time Complexity
* The recursive function makes one call per year, so Time Complexity: O(n)

* Space Complexity: O(n) due to recursive call stack

Optimization Suggestions:

* Use Memoization if intermediate values are reused.

* Use Iterative Approach for large n to avoid stack overflow.

* Alternatively, use power functions or formula-based computation:
	FV = PV × Math.pow(1 + r, n)
	Time Complexity: O(1)