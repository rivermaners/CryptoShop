import java.util.Scanner;

public class CryptoShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyDate date = new MyDate();
        GetLive bitcoin = new GetLive();
        GetLive2 ethereum = new GetLive2();
        Wallet BTC = new Wallet(0, "BTC");
        Wallet BTCamount = new Wallet(1, "BTC");
        Wallet BTCamount2 = new Wallet(0.5, "BTC");
        Wallet ETH = new Wallet(0, "ETH");
        Wallet ETHamount = new Wallet(1, "ETH");
        Wallet ETHamount2 = new Wallet(0.5, "ETH");
        double userBalance = 75000;
        Ledger ledg = new Ledger(userBalance);
        int menu;
        int menu2;

        System.out.println("You have $75,000 to invest.");

        while (userBalance != 0.00) {
            System.out.println("Bitcoin menu: ");
            System.out.println("[1] Check Price");
            System.out.println("[2] Buy Bitcoin");
            System.out.println("[3] Sell Bitcoin");
            System.out.println("[4] Buy Ethereum");
            System.out.println("[5] Sell Ethereum");
            System.out.println("[6] Check Balance");
            System.out.println("[7] View History");
            System.out.println("[8] Exit");
            System.out.println("Option: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Bitcoin price: $" + bitcoin.getLive());
                    System.out.println("Ethereum price: $" + ethereum.getLive());
                    break;
                case 2:
                    System.out.println("[1] Buy one bitcoin");
                    System.out.println("[2] Buy half of a bitcoin");
                    break;
                case 3:
                    System.out.println("[1] Sell one bitcoin");
                    System.out.println("[2] Sell half of a bitcoin");
                    break;
                case 4:
                    System.out.println("[1] Buy one ethereum");
                    System.out.println("[2] Buy half of a ethereum");
                    break;
                case 5:
                    System.out.println("[1] Sell one ethereum");
                    System.out.println("[2] Sell half of a ethereum");
                    break;
                case 6:
                    System.out.println("Your balance is: $" + userBalance);
                    System.out.println(BTC.toString());
                    System.out.println(ETH.toString());
                    break;
                case 7:
                    System.out.println(ledg.toString());
                    System.out.println(ledg.toString2());
                    break;
                case 8:
                    System.out.println("Thank you, goodbye..");
                    break;
            }
            if (menu == 2) {
                System.out.println("Option: ");
                menu2 = scan.nextInt();
                switch (menu2) {
                    case 1:
                        if (userBalance < bitcoin.getLive()) {
                            System.out.println("You do not have enough money.");
                        } else {
                            userBalance = userBalance - (bitcoin.getLive());
                            BTC.addAmount(1);
                            ledg.recordBuy(userBalance, BTCamount, date.getDtf());
                        }
                        break;
                    case 2:
                        if (userBalance < bitcoin.getLive()) {
                            System.out.println("You do not have enough money.");
                        } else {
                            userBalance = userBalance - (bitcoin.getLive() / 2);
                            BTC.addAmount(0.5);
                            ledg.recordBuyHalf(userBalance, BTCamount2, date.getDtf());
                        }
                        break;
                }
            }
            if (menu == 3) {
                System.out.println("Option: ");
                menu2 = scan.nextInt();
                switch (menu2) {
                    case 1:
                        if (BTC.getAmount() < 1) {
                            System.out.println("You do not have enough BTC.");
                        } else {
                            userBalance = userBalance + bitcoin.getLive();
                            BTC.sellAmount(1);
                            ledg.recordSell(userBalance, BTCamount, date.getDtf());
                        }
                        break;
                    case 2:
                        if (BTC.getAmount() < 0.5) {
                            System.out.println("You do not have enough BTC.");
                        } else {
                            userBalance = userBalance + (bitcoin.getLive() / 2);
                            BTC.sellAmount(0.5);
                            ledg.recordSellHalf(userBalance, BTCamount2, date.getDtf());
                        }
                        break;
                }
            }
            if (menu == 4) {
                System.out.println("Option: ");
                menu2 = scan.nextInt();
                switch (menu2) {
                    case 1:
                        if (userBalance < ethereum.getLive()) {
                            System.out.println("You do not have enough money.");
                        } else {
                            userBalance = userBalance - (ethereum.getLive());
                            ETH.addAmount(1);
                            ledg.recordBuy2(userBalance, ETHamount, date.getDtf());
                        }
                        break;
                    case 2:
                        if (userBalance < ethereum.getLive()) {
                            System.out.println("You do not have enough money.");
                        } else {
                            userBalance = userBalance - (ethereum.getLive() / 2);
                            ETH.addAmount(0.5);
                            ledg.recordBuyHalf2(userBalance, ETHamount2, date.getDtf());
                        }
                        break;
                }
            }
            if (menu == 5) {
                System.out.println("Option: ");
                menu2 = scan.nextInt();
                switch (menu2) {
                    case 1:
                        if (ETH.getAmount() < 1) {
                            System.out.println("You do not have enough ETH.");
                        } else {
                            userBalance = userBalance + ethereum.getLive();
                            ETH.sellAmount(1);
                            ledg.recordSell2(userBalance, ETHamount, date.getDtf());
                        }
                        break;
                    case 2:
                        if (ETH.getAmount() < 0.5) {
                            System.out.println("You do not have enough ETH.");
                        } else {
                            userBalance = userBalance + (ethereum.getLive() / 2);
                            ETH.sellAmount(0.5);
                            ledg.recordSellHalf2(userBalance, ETHamount2, date.getDtf());
                        }
                        break;
                }
            }
            if (menu == 8) {
                break;
            }
        }
    }
}
