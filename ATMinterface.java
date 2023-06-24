import java.util.*;

public class ATMinterface {
    private static Scanner input = new Scanner(System.in);
    private static int balance = 1000;

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM! What would you like to do?");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        int choice = input.nextInt();

        switch (choice) {
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
                System.out.println("Thank you for using the ATM!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                main(args);
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is $" + balance);
        main(null);
    }

    private static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        int amount = input.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient funds. Please try again.");
            withdraw();
        } else {
            balance -= amount;
            System.out.println("You have withdrawn $" + amount + ". Your new balance is $" + balance);
            main(null);
        }
    }

    private static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        int amount = input.nextInt();
        balance += amount;
        System.out.println("You have deposited $" + amount + ". Your new balance is $" + balance);
        main(null);
    }
}