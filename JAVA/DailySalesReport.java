import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DailySalesReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the sales and save them to the file
        try {
            System.out.print("Enter number of items to record: ");
            int count = input.nextInt();
            input.nextLine(); // consume leftover Enter

            for (int i = 1; i <= count; i++) {
                System.out.println("Item " + i);

                System.out.print("Item name: ");
                String name = input.nextLine();

                System.out.print("Quantity sold: ");
                int quantity = input.nextInt();

                System.out.print("Price per piece: ");
                double price = input.nextDouble();
                input.nextLine(); // consume leftover Enter

                /*
                 * Format of each line in sales.txt:
                 * itemName,quantity,price
                 * Example: Notebook,3,45.5
                 * The three parts are separated by commas.
                 * One sale is saved per line.
                 */
                // true means append, so the old sales are not erased
                FileWriter writer = new FileWriter("sales.txt", true);
                writer.write(name + "," + quantity + "," + price + "\n");
                writer.close();
            }
            System.out.println("Sales saved!");

        } catch (InputMismatchException e) {
            System.out.println("Error: please type a number for the count, quantity, and price.");
        } catch (IOException e) {
            System.out.println("Error: cannot write to the file.");
        }

        // Read the file and print the report
        System.out.println();
        System.out.println("===== DAILY SALES REPORT =====");
        double grandTotal = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("sales.txt"));
            String line = reader.readLine();

            while (line != null) {
                try {
                    String[] parts = line.split(",");
                    String item = parts[0];
                    int quantity = Integer.parseInt(parts[1]);
                    double price = Double.parseDouble(parts[2]);
                    double lineTotal = quantity * price;

                    grandTotal = grandTotal + lineTotal;

                    System.out.printf("%s | Qty: %d | Price: %,.2f | Total: %,.2f%n",
                            item, quantity, price, lineTotal);

                } catch (NumberFormatException e) {
                    System.out.println("Skipped a damaged line: " + line);
                }
                line = reader.readLine();
            }
            reader.close();

            System.out.println("------------------------------");
            System.out.printf("GRAND TOTAL: %,.2f%n", grandTotal);

        } catch (FileNotFoundException e) {
            System.out.println("Error: sales.txt was not found.");
        } catch (IOException e) {
            System.out.println("Error: cannot read the file.");
        }
    }
}
