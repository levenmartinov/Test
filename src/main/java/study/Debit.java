package study;

import java.util.Scanner;

public class Debit {

    private static String userCardNumber = "9000 8000 7000 6000";
    private static String userPassword = "7412";
    private static double balance = 250000;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cardNumber, password;

        // User login
        while (true) {
            System.out.print("Enter your card number : ");
            cardNumber = scanner.nextLine().replace(" ", "");  // Remove spaces

            System.out.print("Enter your password : ");
            password = scanner.nextLine();

            if (cardNumber.equals(userCardNumber) && password.equals(userPassword)) {
                System.out.println("Login successful...");
                break;
            } else {
                System.out.println("Invalid card number or password. Please try again!");
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
            System.out.print("Choose an option : ");
            int option = scanner.nextInt();

            if (option == 1) {
                // Balance Inquiry
                System.out.println("Your current balance is: £ " + balance);
            } else if (option == 2) {
                // Deposit
                System.out.print("Enter the amount to deposit: ");
                double amount = scanner.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposit successful! New balance: £ " + balance);
                } else {
                    System.out.println("Invalid amount.");
                }
            } else if (option == 3) {
                // Withdraw
                System.out.print("Enter the amount to withdraw : ");
                double amount = scanner.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal successful! New balance: £" + balance );
                } else {
                    System.out.println("Insufficient funds or invalid amount.");
                }
            } else if (option == 4) {
                // Transfer Money
                scanner.nextLine();
                System.out.print("Enter the IBAN to transfer to (must start with TR and be 26 characters): ");
                String iban = scanner.nextLine().toUpperCase();

                if (iban.startsWith("TR") && iban.length() == 26) {
                    System.out.print("Enter the amount to transfer: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Transfer successful! New balance: £" + balance);
                    } else {
                        System.out.println("Insufficient funds or invalid amount.");
                    }
                } else {
                    System.out.println("Invalid IBAN. Returning to main menu.");
                }
            } else if (option == 5) {
                // Change Password
                scanner.nextLine();
                System.out.print("Enter your current password: ");
                String currentPassword = scanner.nextLine();

                if (currentPassword.equals(userPassword)) {
                    System.out.print("Enter your new password: ");
                    String newPassword = scanner.nextLine();

                    System.out.print("Confirm your new password: ");
                    String confirmPassword = scanner.nextLine();

                    if (newPassword.equals(confirmPassword) && newPassword.length() >= 4) {
                        userPassword = newPassword;
                        System.out.println("Password changed successfully!");
                    } else {
                        System.out.println("Passwords do not match or invalid password.");
                    }
                } else {
                    System.out.println("Incorrect current password.");
                }
            } else if (option == 6) {
                // Exit
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

}

