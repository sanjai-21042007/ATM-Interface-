import java.util.Scanner;

class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }

    void checkBalance() {
        System.out.println("Balance: Rs. " + balance);
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;

        do {
            System.out.println("\n=== ATM INTERFACE ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
