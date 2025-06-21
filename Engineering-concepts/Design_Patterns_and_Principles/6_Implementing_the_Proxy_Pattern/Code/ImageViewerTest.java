public class ImageViewerTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("cat.png");
        Image image2 = new ProxyImage("dog.png");

        System.out.println("\nFirst time displaying cat.png:");
        image1.display();

        System.out.println("\nSecond time displaying cat.png:");
        image1.display();

        System.out.println("\nFirst time displaying dog.png:");
        image2.display();
    }
}
