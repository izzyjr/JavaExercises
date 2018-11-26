package com.israelmesa;

public class Account {
    private String accountHolder;
    private double balance = 0;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
    }


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        this.balance -= withdrawalAmount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}
