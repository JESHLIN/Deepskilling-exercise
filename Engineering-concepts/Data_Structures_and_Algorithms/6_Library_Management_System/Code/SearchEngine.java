import java.util.*;
public class SearchEngine {

    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String targetTitle) {

        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        int low = 0, high = books.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = targetTitle.compareToIgnoreCase(books[mid].title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}
