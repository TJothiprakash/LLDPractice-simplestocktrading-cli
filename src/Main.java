


/*User

Represents traders who interact with the platform.
Attributes: id, name, email, portfolio, accountBalance.
Behaviors:
Place orders.
View portfolio.
Receive notifications.
Admin

Manages stocks and system policies.
Attributes: id, name, email.
Behaviors:
Add/remove stocks.
Adjust system settings (e.g., trading hours).
Stock

Represents a listed stock.
Attributes: tickerSymbol, companyName, currentPrice, availableShares.
Behaviors:
Update price.
Manage supply/demand.

Market

Manages the collection of stocks and order books.
Attributes: stocks, orderBooks.
Behaviors:
Add/remove stocks.
Handle order matching.
Order

Abstract representation of buy/sell requests.
Attributes: orderId, stock, quantity, price, type (buy/sell), status.
Behaviors:
Execute order.
Track order lifecycle (pending, matched, completed, cancelled).

Portfolio

Tracks a user's stock holdings and performance.
Attributes: userId, holdings (map of stock → quantity), transactionHistory.
Behaviors:
Add/remove stocks.
Calculate net worth.
Additional Components
OrderBook:

Tracks buy and sell orders for each stock.
Attributes: buyOrders (priority queue), sellOrders (priority queue).
Behaviors:
Add orders.
Match orders.

OrderMatchingEngine:
Centralized system for matching buy and sell orders.
Attributes: orderBooks (map of stock → OrderBook).
Behaviors:
Match orders based on price/time priority.
Notify users of matched orders.

Notification System:
Sends updates to users in real time.
Could use the Observer Pattern for decoupling.
PaymentGateway:
Processes transactions when users buy/sell stocks.
Could use the Strategy Pattern for supporting multiple gateways.
*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}