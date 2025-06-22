1. Understand Search Algorithms

Linear Search

* Scans each element in the list one by one.

* Does not require sorting.

* Simple and works on any list structure.

* Time Complexity:

	Best Case: O(1) (first element match)

	Average/Worst Case: O(n)

Binary Search

* Efficient algorithm that divides the search space in half.

* Works only on sorted data.

* Time Complexity:

	Best Case: O(1)

	Average/Worst Case: O(log n)

2. Analysis

Time Complexity

* Linear Search:

	Best Case: O(1)

 	Worst Case: O(n)

	No sorting needed

* Binary Search:

	Best Case: O(1)

	Worst Case: O(log n)

	Requires sorted data


When to Use Each Algorithm

* Use Linear Search when:

	The dataset is small.

	The dataset is unsorted.

	Simplicity is more important than speed.

* Use Binary Search when:

	The dataset is large and sorted.

	Fast lookups are needed frequently.

	Sorting is manageable or done once.
