package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        Savings savings = new Savings("Israel Mesa");
        Checking checking = new Checking("Israel Mesa");
        Customer customer = new Customer(checking, savings);

        checking.deposit(1000.00);
        checking.withdrawal(50.00);
        System.out.println("Account Holder: " + checking.getAccountHolder()+ ", Balance: " + checking.getBalance());



        savings.deposit(100.00);
        savings.withdrawal(60.00);
        System.out.println("Account Holder: " + savings.getAccountHolder()+ ", Balance: " + savings.getBalance());

        System.out.println("Customer Checking Balance: " + customer.getChecking().getBalance());
        System.out.println("Customer Savings Balance: " + customer.getSavings().getBalance());



        //Add differences to each account type: Checks, Interest
        //Method to create new Customers
    }
}
