public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "The Alchemist", "Paulo Coelho"),
                new Book(102, "Atomic Habits", "James Clear"),
                new Book(103, "Rich Dad Poor Dad", "Robert Kiyosaki"),
                new Book(104, "Clean Code", "Robert C. Martin")
        };

        Book found1 = SearchEngine.linearSearch(books, "Atomic Habits");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Book not found"));
        
        Book found2 = SearchEngine.binarySearch(books, "Clean Code");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Book not found"));
    }
}
