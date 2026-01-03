class CashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " taka using Cash.");
    }
}