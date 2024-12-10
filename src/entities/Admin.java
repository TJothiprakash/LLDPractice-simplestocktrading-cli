package entities;

import java.util.Objects;

/*
Admin
Manages stocks and system policies.
Attributes: id, name, email.
Behaviors:
Add/remove stocks.
Adjust system settings (e.g., trading hours).
*/
public class Admin {
    private int AdminId;
    private String AdminName;
    private String AdminEmail;

    public Admin(int adminId, String adminName, String adminEmail) {
        AdminId = adminId;
        AdminName = adminName;
        AdminEmail = adminEmail;
    }

    // add stock
    public void addStock(Stock stock, Market market) {
        market.getTotalStocks().add(stock);
    }

    // remove stock
    public void removeStock(Stock stock, Market market) {
        market.getTotalStocks().remove(stock);
    }

    // set trading open time
    public void setTradingOpenTime(TradingHours tradingHours, Market market) {
        System.out.println("Trading open time has been set to " + TradingHours.getOpenTime());
        System.out.println("Trading close time has been set ot " + TradingHours.getCloseTime());
        market.setTradingHours(tradingHours);

    }

    @Override
    public String toString() {
        return "Admin{" +
                "AdminId=" + AdminId +
                ", AdminName='" + AdminName + '\'' +
                ", AdminEmail='" + AdminEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return AdminId == admin.AdminId && Objects.equals(AdminName, admin.AdminName) && Objects.equals(AdminEmail, admin.AdminEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AdminId, AdminName, AdminEmail);
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        AdminEmail = adminEmail;
    }
}
