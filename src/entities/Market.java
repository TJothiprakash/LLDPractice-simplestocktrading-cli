package entities;

import java.util.List;

/*Market

Manages the collection of stocks and order books.
Attributes: stocks, orderBooks.
Behaviors:
Add/remove stocks.
Handle order matching.
*/
public class Market {
    private List<Stock> totalStocks;
    private List<Order> totalOrders;
    private TradingHours tradingHours;;

    public TradingHours getTradingHours() {

        return tradingHours;
    }

    public void setTradingHours(TradingHours tradingHours) {
        this.tradingHours = tradingHours;
    }

    public Market(List<Stock> totalStocks, List<Order> totalOrders) {
        this.totalStocks = totalStocks;
        this.totalOrders = totalOrders;
    }

    public List<Stock> getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(List<Stock> totalStocks) {
        this.totalStocks = totalStocks;
    }

    public List<Order> getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(List<Order> totalOrders) {
        this.totalOrders = totalOrders;
    }
}
