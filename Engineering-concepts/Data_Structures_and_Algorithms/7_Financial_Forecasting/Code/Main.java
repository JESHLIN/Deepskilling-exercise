public class Main {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.10; // 10% annual growth
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(initialValue, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
