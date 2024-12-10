package stockmarket;

/*PaymentGateway:
Processes transactions when users buy/sell stocks.
Could use the Strategy Pattern for supporting multiple gateways.
*/

import entities.User;

// Enhanced Payment Gateway
interface PaymentStrategy {
    void processPayment(User user, double amount) throws InvalidOrderException;
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(User user, double amount) throws InvalidOrderException {
        if (amount <= 0) {
            throw new InvalidOrderException("Invalid payment amount: Must be greater than zero.");
        }
        System.out.println("Processed payment of " + amount + " using Credit Card for user: " + user.getName());
    }
}

class PaymentGateway {
    private PaymentStrategy strategy;

    public PaymentGateway(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(User user, double amount) throws InvalidOrderException {
        strategy.processPayment(user, amount);
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
