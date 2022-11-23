public class Ledger {
    private String ledger = "";
    private String ledger2 = "";
    private double userBalance;

    Ledger(double userBalance) {
        this.userBalance = userBalance;
    }

    public void recordBuy(double userBalance, Wallet BTCamount, String date) {
        double amount = this.userBalance - userBalance;
        ledger = ledger + "You bought " + BTCamount + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public void recordSell(double userBalance, Wallet BTCamount, String date) {
        double amount = userBalance - this.userBalance;
        ledger = ledger + "You sold " + BTCamount + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public void recordBuyHalf(double userBalance, Wallet BTCamount2, String date) {
        double amount = this.userBalance - userBalance;
        ledger = ledger + "You bought " + BTCamount2 + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public void recordSellHalf(double userBalance, Wallet BTCamount2, String date) {
        double amount = userBalance - this.userBalance;
        ledger = ledger + "You sold " + BTCamount2 + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public void recordBuy2(double userBalance, Wallet ETHamount, String date) {
        double amount = this.userBalance - userBalance;
        ledger2 = ledger2 + "You bought " + ETHamount + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public void recordSell2(double userBalance, Wallet ETHamount, String date) {
        double amount = userBalance - this.userBalance;
        ledger2 = ledger2 + "You sold " + ETHamount + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public void recordBuyHalf2(double userBalance, Wallet ETHamount2, String date) {
        double amount = this.userBalance - userBalance;
        ledger2 = ledger2 + "You bought " + ETHamount2 + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public void recordSellHalf2(double userBalance, Wallet ETHamount2, String date) {
        double amount = userBalance - this.userBalance;
        ledger2 = ledger2 + "You sold " + ETHamount2 + " for" + " $" + amount + " and your balance is: $" + userBalance + " at " + date + "\n";
        this.userBalance = userBalance;
    }

    public String toString() {
        return ledger;
    }

    public String toString2() {
        return ledger2;
    }
}
