import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void displayMenu() {
        System.out.println("ATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        switch (option) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    private void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    private void withdraw() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the amount to withdraw: $");
            double amount = scanner.nextDouble();
            if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: $" + balance);
            }
        }
    }

    private void deposit() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the amount to deposit: $");
            double amount = scanner.nextDouble();
            balance += amount;
        }
        System.out.println("Deposit successful. Current balance: $" + balance);
    }
}
