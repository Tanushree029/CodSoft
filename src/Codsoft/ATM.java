package Codsoft;
import java.util.Scanner;

    public class ATM {
        private BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public void displayMenu() {
            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nATM Menu");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount you want to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount you want to deposit: ");
                        double depositAmount = sc.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM . " + "\n Have a good day...");
                        break;
                    default:
                        System.out.println("Invalid choice ,  try again.");
                }
            } while (choice != 4);

            sc.close();
        }

        private void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a valid amount.");
                return;
            }
            if (account.getBalance() >= amount) {
                account.withdraw(amount);
                System.out.println("Withdrawal successful! New balance: Rs." + account.getBalance());
            } else {
                System.out.println("Insufficient funds. Your balance is: Rs." + account.getBalance());
            }
        }

        private void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a valid number.");
                return;
            }
            account.deposit(amount);
            System.out.println("Deposit successful! New balance: Rs." + account.getBalance());
        }

        private void checkBalance() {
            System.out.println("Your current balance is: Rs." + account.getBalance());
        }

        public static void main(String[] args) {
            BankAccount userAccount = new BankAccount(10000.00); // Starting balance = Rs.10000
            ATM atm = new ATM(userAccount);
            atm.displayMenu();
        }
    }

 class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot withdraw negative or zero amount.");
            return;
        }
        balance -= amount;
    }
}
