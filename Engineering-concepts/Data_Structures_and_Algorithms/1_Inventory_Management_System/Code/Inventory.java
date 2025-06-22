import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, int quantity, double price) {
        if (productMap.containsKey(productId)) {
            Product product = productMap.get(productId);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(int productId) {
        productMap.remove(productId);
    }

    public void displayInventory() {
        for (Product p : productMap.values()) {
            System.out.println(p);
        }
    }
}
