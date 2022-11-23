public class Wallet {
    private double amount;
    private String coin = "";

    Wallet(double amount, String coin) {
        this.amount = amount;
        this.coin = coin;
    }

    public double getAmount() {
        return amount;
    }

    public void addAmount(double a) {
        amount = amount + a;
    }

    public void sellAmount(double a) {
        amount = amount - a;
    }

    public void baseAmount(double a) {
        amount = a;
    }

    public String toString() {
        return coin + ": " + amount;
    }
}

