public class GrocerySummary {
    public static void main(String[] args) {
        // The grocery data stored in two arrays
        String[] items = {"Rice (1 kg)", "Eggs (1 dozen)", "Cooking oil", "Sugar (1 kg)", "Bread"};
        double[] prices = {58.00, 110.00, 85.50, 72.00, 65.00};

        // For-each loop over items: print a numbered list
        System.out.println("===== GROCERY LIST =====");
        int number = 1;
        for (String item : items) {
            System.out.println(number + ". " + item);
            number++;
        }

        double total = 0;
        double highestPrice = 0;
        int expensiveCount = 0;

        // For-each loop over prices: total, highest price, and count of items P80.00 or more
        for (double price : prices) {
            total = total + price;

            if (price > highestPrice) {
                highestPrice = price;
            }

            if (price >= 80.00) {
                expensiveCount++;
            }
        }

        // Average price using prices.length
        double average = total / prices.length;

        // Print the results with two decimal places
        System.out.println();
        System.out.println("===== SUMMARY =====");
        System.out.printf("Total cost                  : PHP %,.2f%n", total);
        System.out.printf("Highest price               : PHP %,.2f%n", highestPrice);
        System.out.println("Items costing PHP 80.00+    : " + expensiveCount);
        System.out.printf("Average price               : PHP %,.2f%n", average);
    }
}
