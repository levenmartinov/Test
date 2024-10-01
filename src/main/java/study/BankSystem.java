package study;

import java.util.Scanner;

public class BankSystem {
    // Mock user data
    private static String userCardNumber = "1234567890123456";
    private static String userPassword = "1234";
    private static double balance = 250000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardNumber;
        String password;

        // User login
        while (true) {
            System.out.print("Enter your card number: ");
            cardNumber = scanner.nextLine().replace(" ", "");

            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (validateCardNumber(cardNumber) && validatePassword(password)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Invalid card number or password. Please try again.");
            }
        }

        // Main menu loop
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Money");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    balanceInquiry();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    transferMoney(scanner);
                    break;
                case 5:
                    changePassword(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Validate card number
    private static boolean validateCardNumber(String cardNumber) {
        return cardNumber.length() == 16 && cardNumber.matches("\\d+");
    }

    // Validate password
    private static boolean validatePassword(String password) {
        return password.equals(userPassword);
    }

    // Display balance
    private static void balanceInquiry() {
        System.out.println("Your current balance is: £ " + balance);
    }

    // Deposit money
    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: £ " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw money
    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Transfer money
    private static void transferMoney(Scanner scanner) {
        System.out.print("Enter the IBAN to transfer to (must start with TR and be 26 characters): ");
        String iban = scanner.nextLine().toUpperCase();

        if (iban.startsWith("TR") && iban.length() == 26) {
            System.out.print("Enter the amount to transfer: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Transfer successful! New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds or invalid amount.");
            }
        } else {
            System.out.println("Invalid IBAN. Returning to main menu.");
        }
    }

    // Change password
    private static void changePassword(Scanner scanner) {
        System.out.print("Enter your current password: ");
        String currentPassword = scanner.nextLine();

        if (validatePassword(currentPassword)) {
            System.out.print("Enter your new password: ");
            String newPassword = scanner.nextLine();

            System.out.print("Confirm your new password: ");
            String confirmPassword = scanner.nextLine();

            if (newPassword.equals(confirmPassword) && newPassword.length() >= 4) {
                userPassword = newPassword;
                System.out.println("Password changed successfully!");
            } else {
                System.out.println("Passwords do not match or invalid password. Returning to main menu.");
            }
        } else {
            System.out.println("Incorrect current password. Returning to main menu.");
        }
    }
}
