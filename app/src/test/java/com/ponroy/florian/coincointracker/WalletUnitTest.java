package com.ponroy.florian.coincointracker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
    @Test
    public void depositMoney() throws Exception {
        // Create a new Wallet instance, with 0 EUR in it
        Wallet wallet = new Wallet(0);

        // Put 10 EUR in the wallet
        wallet.deposit(10);

        // Check that the wallet actually contains the 10 EUR
        assertEquals(10, wallet.getBalance());
    }
}