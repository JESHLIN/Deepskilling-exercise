public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(100.0);

        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(200.0);

        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
        razorpay.processPayment(1500.0);
    }
}
