public class WebApp implements Observer {
    private String appName;

    public WebApp(String name) {
        this.appName = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(appName + " - Web App received stock price update: ₹" + stockPrice);
    }
}
