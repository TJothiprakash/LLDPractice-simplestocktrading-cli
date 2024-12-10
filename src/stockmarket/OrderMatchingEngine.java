package stockmarket;

import entities.Order;
import entities.Stock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

/*
OrderMatchingEngine:
Centralized system for matching buy and sell orders.
Attributes: orderBooks (map of stock → OrderBook).
Behaviors:
Match orders based on price/time priority.
Notify users of matched orders.
*/
// Enhanced Order Matching Engine
class OrderMatchingEngine {
    private Map<Stock, OrderBook> orderBooks = new ConcurrentHashMap<>(); // Thread-safe
    private NotificationSystem notificationSystem;

    public OrderMatchingEngine(NotificationSystem notificationSystem) {
        this.notificationSystem = notificationSystem;
    }

    public void matchOrders(Stock stock) {
        OrderBook orderBook = orderBooks.computeIfAbsent(stock, k -> new OrderBook());
        PriorityBlockingQueue<Order> buyOrders = orderBook.getBuyOrders();
        PriorityBlockingQueue<Order> sellOrders = orderBook.getSellOrders();

        while (!buyOrders.isEmpty() && !sellOrders.isEmpty()) {
            Order buyOrder = buyOrders.poll();
            Order sellOrder = sellOrders.poll();

            if (buyOrder.getPrice() >= sellOrder.getPrice()) {
                int quantity = Math.min(buyOrder.getQuantity(), sellOrder.getQuantity());
                double matchedPrice = (buyOrder.getPrice() + sellOrder.getPrice()) / 2;

                notificationSystem.notify("trade",
                        "Trade executed: " + quantity + " shares of " + stock.getTickerSymbol() +
                                " at price " + matchedPrice);

                if (buyOrder.getQuantity() > quantity) {
                    buyOrder.setQuantity(buyOrder.getQuantity() - quantity);
                    buyOrders.offer(buyOrder);
                }

                if (sellOrder.getQuantity() > quantity) {
                    sellOrder.setQuantity(sellOrder.getQuantity() - quantity);
                    sellOrders.offer(sellOrder);
                }
            } else {
                buyOrders.offer(buyOrder);
                sellOrders.offer(sellOrder);
                break;
            }
        }
    }

    public void addOrder(Stock stock, Order order) throws InvalidOrderException {
        orderBooks.computeIfAbsent(stock, k -> new OrderBook()).addOrder(order);
    }
}
