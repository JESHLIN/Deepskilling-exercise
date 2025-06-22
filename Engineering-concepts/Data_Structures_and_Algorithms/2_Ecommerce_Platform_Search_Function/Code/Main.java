public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Shampoo", "Personal Care"),
                new Product(104, "Notebook", "Stationery"),
        };

        Product result1 = SearchFunctions.linearSearch(products, "Mouse");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = SearchFunctions.binarySearch(products, "Shampoo");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
