import java.util.Scanner;

public class FreeDeliveryChecker {
    public static void main(String[] args) {
        // Constants for the delivery fee and the free-delivery minimum
        final double deliveryFee = 80.00;
        final double freeDeliveryMinimum = 1000.00;

        Scanner input = new Scanner(System.in);

        // Ask for the customer's name and the order total
        System.out.print("Enter customer's name: ");
        String name = input.nextLine();

        System.out.print("Enter order total: ");
        double orderTotal = input.nextDouble();

        // Use if-else to decide if the delivery is free
        double fee;
        if (orderTotal >= freeDeliveryMinimum) {
            fee = 0.00;
        } else {
            fee = deliveryFee;
        }

        double amountToPay = orderTotal + fee;

        // Print the summary
        System.out.println();
        System.out.println("===== ORDER SUMMARY =====");
        System.out.println("Customer        : " + name);
        System.out.printf("Order Total     : PHP %,.2f%n", orderTotal);
        System.out.printf("Delivery Fee    : PHP %,.2f%n", fee);
        System.out.printf("Amount to Pay   : PHP %,.2f%n", amountToPay);
    }
}
