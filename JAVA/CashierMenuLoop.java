import java.util.Scanner;

public class CashierMenuLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        int itemCount = 0;
        int choice = 0;

        // Loop keeps showing the menu until the cashier chooses 4
        while (choice != 4) {
            // Display the menu
            System.out.println();
            System.out.println("===== CASHIER MENU =====");
            System.out.println("1 - Add an item");
            System.out.println("2 - View current total");
            System.out.println("3 - Start a new customer (reset)");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Switch handles each menu choice
            switch (choice) {
                case 1:
                    System.out.print("Enter item price: ");
                    double price = input.nextDouble();
                    total = total + price;
                    itemCount++;
                    break;
                case 2:
                    System.out.println("Number of items: " + itemCount);
                    System.out.printf("Current total: PHP %,.2f%n", total);
                    break;
                case 3:
                    total = 0;
                    itemCount = 0;
                    System.out.println("Total and item count reset to 0.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        // Goodbye message with the final item count and total
        System.out.println();
        System.out.println("Goodbye!");
        System.out.println("Final item count: " + itemCount);
        System.out.printf("Final total: PHP %,.2f%n", total);
    }
}
