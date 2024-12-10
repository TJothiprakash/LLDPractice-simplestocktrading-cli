package entities;

/*Stock

Represents a listed stock.
Attributes: tickerSymbol, companyName, currentPrice, availableShares.
Behaviors:
Update price.
Manage supply/demand.
*/
public class Stock {
    private String tickerSymbol;
    private String companyName;
    private double currentPrice;
    private int availableShares;

    public Stock(String tickerSymbol, String companyName, double currentPrice, int availableShares) {

        this.tickerSymbol = tickerSymbol;
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.availableShares = availableShares;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", companyName='" + companyName + '\'' +
                ", currentPrice=" + currentPrice +
                ", availableShares=" + availableShares +
                '}';
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getAvailableShares() {
        return availableShares;
    }

    public void setAvailableShares(int availableShares) {
        this.availableShares = availableShares;
    }
}
