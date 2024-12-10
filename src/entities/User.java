package entities;

/*/*
/*User

Represents traders who interact with the platform.
Attributes: id, name, email, portfolio, accountBalance.
Behaviors:
Place orders.
View portfolio.
Receive notifications.*/
public class User {
    private int userId;
    private String name;
    private String email;
    private Portfolio portfolio;
    private double accountBalance;

    public User(int userId, String name, String email, Portfolio portfolio, double accountBalance) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.portfolio = portfolio;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", portfolio=" + portfolio +
                ", accountBalance=" + accountBalance +
                '}';
    }


    // place order
    public void placeOrder(Order order) {
        // logic to place the order
    }

    // view portfolio
    public void viewPortfolio() {
        // logic to display the user's portfolio
    }

    // view notifications
    public void viewNotifications() {
        // logic to display the user's notifications
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void receiveNotification(String message) {
    }
}
