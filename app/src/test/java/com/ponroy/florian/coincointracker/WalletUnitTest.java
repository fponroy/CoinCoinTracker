package com.ponroy.florian.coincointracker;

import com.ponroy.florian.coincointracker.model.Wallet;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
    @Test
    public void createWallet() throws Exception {
        // Create a new Wallet instance, with 42 EUR in it
        Wallet wallet = new Wallet(42);

        // Check that the wallet actually contains 42 EUR
        assertEquals(42, wallet.getBalance(), 0.001);
    }

    @Test
    public void depositMoney() throws Exception {
        // Create a new Wallet instance, with 0 EUR in it
        Wallet wallet = new Wallet(0);

        // Put 10 EUR in the wallet
        wallet.deposit(10);

        // Check that the wallet actually contains the 10 EUR
        assertEquals(10, wallet.getBalance(), 0.001);
    }

    @Test
    public void withdrawMoney() throws Exception {
        // Create a new Wallet instance, with 30 EUR in it
        Wallet wallet = new Wallet(30);

        // Get 10 EUR from the wallet
        wallet.withdraw(10);

        // Check that the wallet actually contains the 10 EUR
        assertEquals(20, wallet.getBalance(), 0.001);
    }

    @Test(expected = Exception.class)
    public void withdrawMoneyBelowThreshold() throws Exception {
        // Create a new Wallet instance, with 10 EUR in it
        Wallet wallet = new Wallet(10);

        // Get more money than possible. Should throw an exception
        wallet.withdraw(15);
    }

    @Test(expected = Exception.class)
    public void depositMoneyAboveCapacity() throws Exception {
        // Create a new Wallet instance, with 10 EUR in it
        Wallet wallet = new Wallet(10);

        // Put more money than possible. Should throw an exception
        wallet.deposit(25);
    }
}