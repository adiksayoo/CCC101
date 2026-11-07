// This program prints a simple receipt for one customer's order
// at the school canteen. It computes the subtotals and the total amount due.
public class CanteenReceipt {
    public static void main(String[] args) {

        // Customer's Name
        String name = "Michael Dave";

        // Product Name, Price, and Quantity
        String productName1 = "Fried Chicken";
        double price1 = 55.0;
        int quantity1 = 3;

        String productName2 = "Coke Zero";
        double price2 = 60.0;
        int quantity2 = 3;

        // Calculate Total Price for Each Product
        double subtotal1 = price1 * quantity1;
        double subtotal2 = price2 * quantity2;
        double totalAmount = subtotal1 + subtotal2;

        // Receipt Output
        System.out.println("==============================");
        System.out.println("        SCHOOL CANTEEN");
        System.out.println("==============================");
        System.out.println("Customer: " + name);
        System.out.println("");
        System.out.println("Item: " + productName1);
        System.out.println("Price: " + price1 + " x " + quantity1 + " = " + subtotal1);
        System.out.println("");
        System.out.println("Item: " + productName2);
        System.out.println("Price: " + price2 + " x " + quantity2 + " = " + subtotal2);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("TOTAL AMOUNT DUE: " + totalAmount);
        System.out.println("==============================");
        System.out.println("Thank you and come again!");

    }
}
