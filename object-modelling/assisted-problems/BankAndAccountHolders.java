// BankAndAccountHolders.java
// Problem 2: Bank and Account Holders (Association)
// A Bank has Customer objects associated with it. Customers open accounts and view balances.

import java.util.ArrayList;

class Customer {
    String name;
    String accountNumber;
    double balance;
    
    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Method to view balance
    public void viewBalance() {
        System.out.println(name + " (Account: " + accountNumber + ") - Balance: $" + balance);
    }
}

class Bank {
    String bankName;
    // Association: Bank holds a list of customers.
    private ArrayList<Customer> customers;
    
    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }
    
    // Method to open an account for a customer (i.e., add customer to bank)
    public void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println("Account opened for " + customer.name + " at " + bankName);
    }
    
    // Display all customer details
    public void displayCustomers() {
        System.out.println("Bank: " + bankName + " Customer List:");
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        
        Customer cust1 = new Customer("Alice", "GB1001", 1200.50);
        Customer cust2 = new Customer("Bob", "GB1002", 980.75);
        
        // Open accounts for customers
        bank.openAccount(cust1);
        bank.openAccount(cust2);
        
        // Display all customers of the bank
        bank.displayCustomers();
    }
}
