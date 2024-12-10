package entities;

import java.util.List;

/*Portfolio

Tracks a user's stock holdings and performance.
Attributes: userId, holdings (map of stock → quantity), transactionHistory.
Behaviors:
Add/remove stocks.
Calculate net worth.*/
public class Portfolio {
    private int userId;
    private double netWorth;
    private List<Order> holdings;
    private List<String> transactionHistory;


    public Portfolio(int userId, double netWorth, List<Order> holdings, List<String> transactionHistory) {
        this.userId = userId;
        this.netWorth = netWorth;
        this.holdings = holdings;
        this.transactionHistory = transactionHistory;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "userId=" + userId +
                ", netWorth=" + netWorth +
                ", holdings=" + holdings +
                ", transactionHistory=" + transactionHistory +
                '}';
    }

    // add stock
    public void addStock(Stock tickerSymbol, int quantity, int orderId) {
        holdings.add(new Order(orderId, tickerSymbol, quantity, 0, OrderType.BUY, OrderStatus.PENDING));
    }

    // remove stock
    public void removeStock(Stock tickerSymbol, int quantity, int orderId) {
        holdings.remove(new Order(orderId, tickerSymbol, quantity, 0, OrderType.BUY, OrderStatus.PENDING));
    }

    // calculate net worth
    public double calculateNetWorth() {
        double netWorth = 0;
        for (Order order : holdings) {
            netWorth += order.getQuantity() * order.getStock().getCurrentPrice();
        }
        return netWorth;
    }

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public List<Order> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<Order> holdings) {
        this.holdings = holdings;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}
