1. Understand Linked Lists

Singly Linked List

* Each node contains data and a reference to the next node.

* Traversal is one-directional (forward).

* Efficient for insertion and deletion operations (no need to shift elements).

Doubly Linked List

* Each node contains data, a next pointer, and a previous pointer.

* Allows bi-directional traversal.

* Slightly more memory usage due to extra pointer.

Why Use Linked Lists?

* Efficient for dynamic data (no fixed size).

* Easier insertion/deletion compared to arrays (especially in the middle).

* Arrays require shifting, while linked lists only change pointers.

2. Analysis

Time Complexity

* Add Task (at end): O(n) – traverse to last node.

* Search Task: O(n) – linear search.

* Traverse Tasks: O(n) – visit each node once.

* Delete Task: O(n) – search node, then relink.

Advantages of Linked Lists over Arrays

* Dynamic Size: No need to define capacity beforehand.

* Efficient Insertions/Deletions: No shifting of elements required.

* Better for Frequent Modifications: Useful when frequent additions/removals are needed.

