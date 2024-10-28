import java.util.Scanner;
import bank.BankAccount;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String customerName = scanner.nextLine();
        System.out.println("Enter Account Number");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter Deposit Amount not less than 10000");
        double depositAmount = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(customerName, depositAmount, accountNumber);
        boolean running = true;

        while(running) {
            System.out.println("\n1.Deposit Money");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Display Balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount to deposit");
                    double amount = scanner.nextDouble();
                    bankAccount.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter Amount to withdraw");
                    double withdraw = scanner.nextDouble();
                    bankAccount.withdraw(withdraw);
                    break;
                case 3:
                    bankAccount.displayBalance();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            if (bankAccount.getBalance() <= 10000.0) {
                System.out.println("Your account balance is less than 10000");
                break;
            }
        }
        scanner.close();
    }
    }

