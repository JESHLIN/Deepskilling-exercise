public class Main {
    public static void main(String[] args) {
        // Try to get Logger instances multiple times
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use logger
        logger1.log("This is the first message.");
        logger2.log("This is the second message.");

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger is used.");
        } else {
            System.out.println("Different Logger instances found.");
        }
    }
}
