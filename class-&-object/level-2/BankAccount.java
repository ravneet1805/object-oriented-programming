// 2. Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
// Add methods for:
//   - Depositing money.
//   - Withdrawing money (only if sufficient balance exists).
//   - Displaying the current balance.

import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    
    // Constructor to initialize account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if(amount > 0) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = in.next();
        System.out.print("Enter account number: ");
        String accountNum = in.next();
        System.out.print("Enter initial balance: ");
        double initialBalance = in.nextDouble();
        
        BankAccount account = new BankAccount(name, accountNum, initialBalance);
        // Demonstrate deposit and withdrawal operations
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1000);  // May trigger insufficient balance message
        account.displayBalance();
    }
}
