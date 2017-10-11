package com.ponroy.florian.coincointracker.model;

/**
 * Created by Florian PONROY - OpenClassrooms on 10/10/17.
 */

public class Wallet {
    private double mBalance;
    private static final double CAPACITY = 30.0;

    public Wallet(double initialBalance) {
        mBalance = initialBalance;
    }

    public void deposit(double amount) throws Exception {
        if ((mBalance + amount) > CAPACITY) {
            throw new Exception("Too many coins!");
        }

        mBalance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > mBalance) {
            throw new Exception("Not enough cash!");
        }

        mBalance -= amount;
    }

    public double getBalance() {
        return mBalance;
    }
}
