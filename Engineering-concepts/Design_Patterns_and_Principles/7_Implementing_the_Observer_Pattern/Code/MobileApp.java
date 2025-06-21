public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String name) {
        this.appName = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(appName + " - Mobile App received stock price update: ₹" + stockPrice);
    }
}
