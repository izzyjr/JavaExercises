package com.israelmesa;

public class Customer {
    private Checking checking;
    private Savings savings;

    public Customer(Checking checking, Savings savings) {
        this.checking = checking;
        this.savings = savings;
    }

    public Checking getChecking() {
        return checking;
    }

    public Savings getSavings() {
        return savings;
    }

    
}
