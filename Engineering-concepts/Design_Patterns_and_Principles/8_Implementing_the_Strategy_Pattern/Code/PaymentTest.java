public class PaymentTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "Anna"));
        context.payAmount(25000);
        
        context.setPaymentStrategy(new PayPalPayment("anna@example.com"));
        context.payAmount(15500);
    }
}
