1. Understand Array Representation

* Arrays are a collection of elements stored in contiguous memory locations.

* Each element can be accessed directly using its index (random access).

* Arrays are fixed in size, which means memory is allocated at the time of declaration.

Advantages:

* Fast access using index (O(1) time).

* Easy to implement and understand.

* Efficient for storing a known, fixed-size list of data.

Disadvantages:

* Not dynamic; resizing requires copying to a new array.

* Insertion/deletion can be costly if done in the middle (due to shifting).

2. Analysis

Time Complexity of Operations

* Add Employee:

	Time: O(1) (insert at end if not full)

* Search Employee:

	Time: O(n) (linear search)

* Traverse Employees:

	Time: O(n) (visit each element once)

* Delete Employee:

	Time: O(n) (search + shift elements)

Limitations of Arrays:

* Fixed Size: Cannot grow/shrink dynamically.

* Inefficient Deletions: Requires shifting elements.

* Linear Search: No fast searching unless sorted.

* Better alternatives: ArrayList, HashMap, or LinkedList when:

* Dynamic resizing is needed.

* Frequent insertions/deletions are required.