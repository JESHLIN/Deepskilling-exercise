public class NotificationTest {
    public static void main(String[] args) {
        // Base notifier: only Email
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS notification
        Notifier emailAndSMS = new SMSNotifierDecorator(emailNotifier);

        // Add Slack notification
        Notifier allChannels = new SlackNotifierDecorator(emailAndSMS);

        // Send message via all channels
        allChannels.send("Server is down!");
    }
}
