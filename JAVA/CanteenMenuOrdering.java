import java.util.Scanner;

public class CanteenMenuOrdering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the menu
        System.out.println("===== CANTEEN MENU =====");
        System.out.println("1 - Chicken adobo meal  PHP 65.00");
        System.out.println("2 - Pancit canton       PHP 40.00");
        System.out.println("3 - Fried rice          PHP 25.00");
        System.out.println("4 - Bottled water       PHP 15.00");
        System.out.println("5 - Iced tea            PHP 30.00");
        System.out.println();

        // Ask for the choice and the quantity
        System.out.print("Enter your choice (1-5): ");
        int choice = input.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        String item = "";
        double price = 0;
        boolean isValid = true;

        // First switch: set the item name and the price
        switch (choice) {
            case 1:
                item = "Chicken adobo meal";
                price = 65.00;
                break;
            case 2:
                item = "Pancit canton";
                price = 40.00;
                break;
            case 3:
                item = "Fried rice";
                price = 25.00;
                break;
            case 4:
                item = "Bottled water";
                price = 15.00;
                break;
            case 5:
                item = "Iced tea";
                price = 30.00;
                break;
            default:
                isValid = false;
                System.out.println("Invalid menu choice.");
        }

        // Only continue if the choice is valid
        if (isValid) {
            String category = "";

            // Second switch: grouped cases to set the category
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    category = "Food";
                    break;
                case 4:
                case 5:
                    category = "Drink";
                    break;
            }

            double total = price * quantity;

            System.out.println();
            System.out.println("===== ORDER SUMMARY =====");
            System.out.println("Item            : " + item);
            System.out.println("Category        : " + category);
            System.out.println("Quantity        : " + quantity);
            System.out.printf("Price per piece : PHP %,.2f%n", price);
            System.out.printf("Total amount    : PHP %,.2f%n", total);
        }
    }
}
