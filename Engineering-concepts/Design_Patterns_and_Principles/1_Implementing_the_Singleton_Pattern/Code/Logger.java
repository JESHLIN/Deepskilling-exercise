public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Make constructor private so it can't be called from outside
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Provide public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // only created once
        }
        return instance;
    }

    // Extra: Add a method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
