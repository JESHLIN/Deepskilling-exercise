import java.util.*;
public class SearchFunctions {

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = targetName.compareToIgnoreCase(products[mid].productName);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }
}
