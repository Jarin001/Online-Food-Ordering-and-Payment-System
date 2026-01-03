public class Main {
        public static void main(String[] args) {

                FoodOrder order = FoodOrderFactory.createOrder("pizza", true, true);

                System.out.println("Order: " + order.getFood().getDescription());
                System.out.println("Total cost: $" + order.getFood().cost());

                order.getPreparation().prepareFood();

                PaymentContext paymentContext = new PaymentContext();
                paymentContext.setPaymentStrategy(new CreditCardPayment());
                paymentContext.pay(order.getFood().cost());

                System.out.println("\nSwitching payment method at runtime...\n");

                paymentContext.setPaymentStrategy(new BKashPayment());
                paymentContext.pay(order.getFood().cost());
        }
}