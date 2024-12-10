package entities;

import java.util.List;

/*Order

Abstract representation of buy/sell requests.
Attributes: orderId, stock, quantity, price, type (buy/sell), status.
Behaviors:
Execute order.
Track order lifecycle (pending, matched, completed, cancelled).
*/
public class Order {
    private int orderId;
    private Stock stock;
    private int quantity;
    private double price;
    private OrderType orderType;
    private OrderStatus status;

    public Order(int orderId, Stock stock, int quantity, double price, OrderType orderType, OrderStatus status) {

        this.orderId = orderId;
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.orderType = orderType;
        this.status = status;
    }



    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", stock=" + stock +
                ", quantity=" + quantity +
                ", price=" + price +
                ", orderType=" + orderType +
                ", status=" + status +
                '}';
    }

    public int getOrderId() {

        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
