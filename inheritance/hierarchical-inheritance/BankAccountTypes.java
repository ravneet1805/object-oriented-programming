// BankAccountTypes.java
// Problem 8: Bank Account Types (Hierarchical Inheritance)
class BankAccount {
    String accountNumber;
    double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    public void displayAccountType() {
        System.out.println("Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    
    public void displayAccountType() {
        System.out.println("Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months
    
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        displayDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 10000, 12);
        
        System.out.println("----Savings Account----");
        sa.displayAccountType();
        System.out.println("\n----Checking Account----");
        ca.displayAccountType();
        System.out.println("\n----Fixed Deposit Account----");
        fda.displayAccountType();
    }
}
