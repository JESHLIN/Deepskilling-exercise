public class StockMarketTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileObserver = new MobileApp("TraderPro");
        Observer webObserver = new WebApp("StockDashboard");

        stockMarket.registerObserver(mobileObserver);
        stockMarket.registerObserver(webObserver);

        stockMarket.setStockPrice(15000);
        stockMarket.setStockPrice(20000);

        stockMarket.removeObserver(webObserver);
        stockMarket.setStockPrice(25000);
    }
}
