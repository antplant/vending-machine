package vending;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest implements IDisplay {
    private String displayText;

    @Test
    public void displaysZeroBalance() {
        VendingMachine vendingMachine = new VendingMachine();
        IDisplay display = this;

        vendingMachine.displayBalance(display);

        assertEquals("0", displayText);
    }

    @Override
    public void display(String toDisplay) {
        displayText = toDisplay;
    }
}