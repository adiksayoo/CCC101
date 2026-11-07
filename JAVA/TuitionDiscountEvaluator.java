import java.util.Scanner;

public class TuitionDiscountEvaluator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the student's name, GWA, and tuition amount
        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter GWA: ");
        double gwa = input.nextDouble();

        System.out.print("Enter tuition amount: ");
        double tuition = input.nextDouble();

        double discountRate = 0;
        String warning = "";
        boolean isValid = true;

        // Laddered if-else: check the invalid GWA first
        if (gwa < 1.00 || gwa > 5.00) {
            isValid = false;
        } else if (gwa <= 1.25) {
            discountRate = 0.50;
        } else if (gwa <= 1.50) {
            discountRate = 0.30;
        } else if (gwa <= 1.75) {
            discountRate = 0.20;
        } else if (gwa <= 2.00) {
            discountRate = 0.10;
        } else if (gwa <= 3.00) {
            discountRate = 0.0;
        } else {
            discountRate = 0.0;
            warning = "Academic probation: please see your adviser.";
        }

        System.out.println();
        if (isValid) {
            double discountAmount = tuition * discountRate;
            double amountDue = tuition - discountAmount;

            System.out.println("===== TUITION DISCOUNT =====");
            System.out.println("Student         : " + name);
            System.out.printf("GWA             : %.2f%n", gwa);
            System.out.printf("Discount Rate   : %.0f%%%n", discountRate * 100);
            System.out.printf("Discount Amount : PHP %,.2f%n", discountAmount);
            System.out.printf("Amount Due      : PHP %,.2f%n", amountDue);
            if (!warning.equals("")) {
                System.out.println(warning);
            }
        } else {
            // Invalid GWA: no amounts are computed
            System.out.println("Invalid GWA. It must be from 1.00 to 5.00.");
        }
    }
}
