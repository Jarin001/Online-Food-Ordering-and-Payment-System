public class BKashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " taka using BKash.");
    }
}
