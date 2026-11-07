import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        double balance = 5000.00;
        Scanner input = new Scanner(System.in);

        try {
            System.out.printf("Current balance: PHP %,.2f%n", balance);
            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();

            // Reject invalid amounts by throwing an exception
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid amount. The amount must be greater than zero.");
            }
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient balance. The amount is greater than your balance.");
            }

            // Valid withdrawal
            balance = balance - amount;
            System.out.printf("Amount withdrawn: PHP %,.2f%n", amount);
            System.out.printf("New balance     : PHP %,.2f%n", balance);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number, not letters.");
        } catch (IllegalArgumentException e) {
            System.out.println("Transaction rejected: " + e.getMessage());
        } finally {
            // The activity requires closing the Scanner here
            System.out.println("Thank you for banking with us.");
            input.close();
        }
    }
}
