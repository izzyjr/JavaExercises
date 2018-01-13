package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        Checking checking = new Checking("Israel Mesa");

       checking.deposit(100.00);
       checking.withdrawal(50.00);
       System.out.println("Account Holder: " + checking.getAccountHolder()+ ", Balance: " + checking.getBalance());

       Savings savings = new Savings("Israel Mesa");

        savings.deposit(100.00);
        savings.withdrawal(60.00);
        System.out.println("Account Holder: " + savings.getAccountHolder()+ ", Balance: " + savings.getBalance());


    }
}
