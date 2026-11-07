import java.util.Scanner;

public class MonthlyInstallmentTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the starting balance and the monthly payment
        System.out.print("Enter starting balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter monthly payment: ");
        double monthlyPayment = input.nextDouble();

        int month = 0;

        System.out.println();
        System.out.println("===== PAYMENT SCHEDULE =====");

        // While loop: continue while the balance is greater than 0
        while (balance > 0) {
            month++;

            // Pay the monthly amount, but in the last month pay only what is left
            double payment = monthlyPayment;
            if (payment > balance) {
                payment = balance;
            }

            balance = balance - payment;

            System.out.printf("Month %d | Payment: PHP %,.2f | Remaining: PHP %,.2f%n",
                    month, payment, balance);
        }

        // Print the total number of months after the loop
        System.out.println();
        System.out.println("Total months to pay off: " + month);
    }
}
