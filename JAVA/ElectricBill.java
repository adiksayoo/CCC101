/**
 * Electric Bill Statement
 * This program prepares a monthly electric bill for a household.
 * It reads the meter readings and the rate per kWh, computes the
 * energy charge, a 12% tax, and the total amount due, then prints
 * a billing statement.
 *
 * Author: Lemuel Alfeo P. Jabajab
 * Date: November 4, 2026
 */
import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        // Constant for the tax rate (12%)
        final double taxRate = 0.12;

        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter customer's name: ");
        String name = input.nextLine();

        System.out.print("Enter previous meter reading (kWh): ");
        int previous = input.nextInt();

        System.out.print("Enter current meter reading (kWh): ");
        int current = input.nextInt();

        System.out.print("Enter rate per kWh: ");
        double rate = input.nextDouble();

        /*
         * How the bill is computed:
         * 1. kWh consumed = current reading - previous reading
         * 2. Energy charge = kWh consumed x rate per kWh
         * 3. Tax = energy charge x tax rate (12%)
         * 4. Total amount due = energy charge + tax
         */
        // Compute consumption, charge, tax, and total
        int kwhConsumed = current - previous;
        double energyCharge = kwhConsumed * rate;
        double tax = energyCharge * taxRate;
        double totalDue = energyCharge + tax;

        // Testing only: prints the computed values to verify the math.
        // System.out.println("DEBUG: kWh=" + kwhConsumed + ", charge=" + energyCharge + ", tax=" + tax);

        // Print the billing statement
        System.out.println();
        System.out.println("===== ELECTRIC BILL STATEMENT =====");
        System.out.println("Customer         : " + name);
        System.out.println("Previous Reading : " + previous + " kWh");
        System.out.println("Current Reading  : " + current + " kWh");
        System.out.println("kWh Consumed     : " + kwhConsumed + " kWh");
        System.out.printf("Energy Charge    : PHP %,.2f%n", energyCharge);
        System.out.printf("Tax (12%%)        : PHP %,.2f%n", tax);
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL AMOUNT DUE : PHP %,.2f%n", totalDue);
    }
}
