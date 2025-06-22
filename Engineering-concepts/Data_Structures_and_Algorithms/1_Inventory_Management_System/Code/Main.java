public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 75000.00);
        Product p2 = new Product(102, "Mouse", 100, 450.00);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayInventory();

        inventory.updateProduct(102, 80, 400.00);
        inventory.deleteProduct(101);

        inventory.displayInventory();
    }
}
