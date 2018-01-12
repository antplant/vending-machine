package vending;

public class VendingMachine {
    private int balance;

    public void displayBalance(IDisplay display) {
        display.display(Integer.toString(balance));
    }

    public void insertCoin(int pence) {
        this.balance += pence;
    }
}
