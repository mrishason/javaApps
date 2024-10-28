package bank;

public class BankAccount {
    private String accountHolderName;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountHolderName, double initialBalance, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if (initialBalance >= 10000.0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Insufficient balance. Setting initial balance to 10,000.");
            this.balance = 10000.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
            System.out.println("Deposited " + amount + " to " + this.accountHolderName +
                    " with Account Number " + this.accountNumber);
        } else {
            System.out.println("Deposited amount must be greater than 0.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 400000.0) {
            System.out.println("Withdraw amount exceeded. Max withdraw amount is 400,000.");
            return false;
        } else if (this.balance - amount >= 10000.0) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " from " + this.accountHolderName +
                    " with Account Number " + this.accountNumber + " is successful.");
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance Amount: " + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }
}
