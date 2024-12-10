package stockmarket;

import entities.Order;
import entities.OrderType;

import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/*OrderBook:

Tracks buy and sell orders for each stock.
Attributes: buyOrders (priority queue), sellOrders (priority queue).
Behaviors:
Add orders.
Match orders.
*/
// Enhanced Order Book for Scalability
class OrderBook {
    private PriorityBlockingQueue<Order> buyOrders;
    private PriorityBlockingQueue<Order> sellOrders;

    public OrderBook() {
        this.buyOrders = new PriorityBlockingQueue<>((Collection) (o1, o2) -> {
            int compare = Double.compare(o2.getPrice(),
                    o1.getPrice());
            return compare;
        }); // Max-Heap
         this.sellOrders = new PriorityBlockingQueue<>((Collection) Comparator.comparingDouble(Order::getPrice)); // Min-Heap
    }

    public void addOrder(Order order) throws InvalidOrderException {
        if (order.getQuantity() <= 0 || order.getPrice() <= 0) {
            throw new InvalidOrderException("Invalid order: Quantity and price must be greater than zero.");
        }

        if (order.getOrderType() == OrderType.BUY) {
            buyOrders.offer(order);
        } else {
            sellOrders.offer(order);
        }
    }

    public PriorityBlockingQueue<Order> getBuyOrders() {
        return buyOrders;
    }

    public PriorityBlockingQueue<Order> getSellOrders() {
        return sellOrders;
    }
}
