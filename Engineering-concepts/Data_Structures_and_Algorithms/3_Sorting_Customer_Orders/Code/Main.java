public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Anna", 150),
                new Order(2, "Jack", 450),
                new Order(3, "Alex", 300),
                new Order(4, "Lily", 400)
        };

        System.out.println("Before Sorting:");
        for (Order o : orders) System.out.println(o);

        Sorter.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort (Descending by totalPrice):");
        for (Order o : orders) System.out.println(o);

        Order[] orders2 = {
                new Order(1, "Anna", 150),
                new Order(2, "Jack", 450),
                new Order(3, "Alex", 300),
                new Order(4, "Lily", 400)
        };

        Sorter.quickSort(orders2, 0, orders2.length - 1);
        System.out.println("\nAfter Quick Sort (Descending by totalPrice):");
        for (Order o : orders2) System.out.println(o);
    }
}
