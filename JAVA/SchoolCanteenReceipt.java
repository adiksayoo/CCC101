// This program prints a receipt for one customer at the school canteen.
// It computes the cost of each item, the grand total, the VAT, and the change.
public class SchoolCanteenReceipt {
    public static void main(String[] args) {
        // VAT rate stored as a constant (12%)
        final double vatRate = 0.12;

        // Customer Information
        String name = "Michael Dave";

        // Prices and Quantities of the Items Purchased
        double chickenAdoboPrice = 65.00;
        int chickenAdoboQuantity = 2;

        double bottledWaterPrice = 15.00;
        int bottledWaterQuantity = 3;

        double bananaCuePrice = 12.50;
        int bananaCueQuantity = 4;

        // Amount the Customer pays with
        double amountPaid = 500.00;

        // Calculate the Cost of Each Item
        double chickenAdoboCost = chickenAdoboPrice * chickenAdoboQuantity;
        double bottledWaterCost = bottledWaterPrice * bottledWaterQuantity;
        double bananaCueCost = bananaCuePrice * bananaCueQuantity;

        // Calculate the Final Total and Change
        double grandTotal = chickenAdoboCost + bottledWaterCost + bananaCueCost;
        double change = amountPaid - grandTotal;

        // Calculate VAT
        double vatAmount = Math.round(grandTotal * vatRate / (1 + vatRate) * 100) / 100.0;

        // Output
        System.out.println("=========================================");
        System.out.println("           SCHOOL CANTEEN RECEIPT");
        System.out.println("=========================================");
        System.out.println("Customer: " + name);
        System.out.println();

        // Items table
        System.out.println("Item               | Price | Qty | Cost");
        System.out.println("-------------------+-------+-----+--------");
        System.out.println("Chicken adobo meal | " + chickenAdoboPrice + "  | " + chickenAdoboQuantity + "   | "
                + chickenAdoboCost);
        System.out.println("Bottled water      | " + bottledWaterPrice + "  | " + bottledWaterQuantity + "   | "
                + bottledWaterCost);
        System.out.println(
                "Banana cue         | " + bananaCuePrice + "  | " + bananaCueQuantity + "   | " + bananaCueCost);
        System.out.println();

        // Summary table
        System.out.println("Summary            | Amount");
        System.out.println("-------------------+--------");
        System.out.println("Grand Total        | " + grandTotal);
        System.out.println("VAT (12% included) | " + vatAmount);
        System.out.println("Amount Paid        | " + amountPaid);
        System.out.println("Change             | " + change);
        System.out.println("=========================================");
    }
}
