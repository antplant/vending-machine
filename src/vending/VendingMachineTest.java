package vending;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest implements IDisplay {
    private String displayText;

    @Test
    public void displaysZeroBalance() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayBalance(this);

        assertEquals("0", displayText);
    }

    @Test
    public void displaysCredit() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(5);

        vendingMachine.displayBalance(this);
        assertEquals("5", displayText);
    }

    @Test
    public void canAddMultipleCoins() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(5);
        vendingMachine.insertCoin(2);

        vendingMachine.displayBalance(this);
        assertEquals("7", displayText);
    }

    @Override
    public void display(String toDisplay) {
        displayText = toDisplay;
    }
}