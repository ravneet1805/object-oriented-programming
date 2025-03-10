// BankAccount.java
// Problem: Bank Account Management
// Create a BankAccount class with accountNumber (public), accountHolder (protected), and balance (private).
// Provide public methods to access and modify balance.
// Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    // Getter and setter for balance
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
    }
    
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance)
            balance -= amount;
    }
    
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    
    public void displaySavingsAccount() {
        // Can access accountNumber (public) and accountHolder (protected) directly.
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : $" + getBalance());
    }
    
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "David", 1000.00);
        sa.displaySavingsAccount();
    }
}
