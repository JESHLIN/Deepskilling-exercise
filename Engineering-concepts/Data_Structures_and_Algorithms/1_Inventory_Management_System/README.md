Why Data Structures and Algorithms Are Essential

* Help manage large datasets efficiently.
* Enable quick searching, adding, updating, and deleting.
* Improve memory usage and processing speed.
* Ensure system performance remains high as data grows.

Suitable Data Structures

1. ArrayList

   * Ordered list of products.
   * Easy to iterate.
   * Drawback: Slow search, update, and delete (O(n)).

2. HashMap

   * Key: productId, Value: Product object.
   * Fast operations: add, update, delete, and search in O(1).
   * Unordered by default.

3. TreeMap

   * Maintains products in sorted order of productId.
   * All operations take O(log n) time.
   * Useful if sorted display is needed.

Analysis – Time Complexities (using HashMap)

Add Product:

* Time Complexity: O(1)

* Reason: Direct insertion using productId as the key.

Update Product:

* Time Complexity: O(1)

* Reason: Quick access via key to update fields.

Delete Product:

* Time Complexity: O(1)

* Reason: Direct removal using the key.

Display Inventory:

* Time Complexity: O(n)

* Reason: Iterates through all product values in the map.
