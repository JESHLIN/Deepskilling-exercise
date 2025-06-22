1. Understand Sorting Algorithms

Bubble Sort

* Repeatedly compares and swaps adjacent elements if they are in the wrong order.

* Easy to implement but inefficient for large datasets.

* Time Complexity:

	Best Case: O(n) (when already sorted)

	Average & Worst Case: O(n²)

Insertion Sort

* Builds the final sorted array one item at a time.

* Good for small or nearly sorted datasets.

* Time Complexity:

	Best Case: O(n)

	Worst Case: O(n²)

Quick Sort

* A divide-and-conquer algorithm.

* Selects a pivot, partitions the array, and recursively sorts the subarrays.

* Efficient in practice for large datasets.

* Time Complexity:

	Best & Average Case: O(n log n)

	Worst Case: O(n²) (if poorly chosen pivots)

Merge Sort

* Also uses divide-and-conquer.

* Recursively divides and merges arrays in sorted order.

* Time Complexity: Always O(n log n)

	Requires extra space (O(n))

2. Analysis

Bubble Sort

* Simple to implement.

* Inefficient on large datasets due to nested loops.

* Time complexity is high: O(n²) even for moderately sized data.

* Not preferred in real-world applications.

Quick Sort

* Much faster for large datasets due to divide-and-conquer.

* More efficient than Bubble Sort on average.

* Has worst-case complexity of O(n²), but this is rare with good pivot choices.

* Commonly used in practice because of its in-place sorting and low overhead.

Conclusion

* Quick Sort is preferred over Bubble Sort for performance-critical systems like e-commerce.

* For small datasets or educational purposes, Bubble Sort may be easier to understand and implement.

