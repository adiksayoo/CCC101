import java.util.Scanner;

public class SeatChartGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the number of rows and the number of seats per row
        System.out.print("Enter number of rows (1-26): ");
        int numRows = input.nextInt();

        System.out.print("Enter number of seats per row: ");
        int seatsPerRow = input.nextInt();

        System.out.println();

        // Outer loop is for the rows, inner loop is for the seats
        for (int row = 1; row <= numRows; row++) {
            // Type cast: turn the row number into a letter (1 = A, 2 = B, ...)
            char rowLetter = (char) ('A' + row - 1);

            for (int seat = 1; seat <= seatsPerRow; seat++) {
                System.out.print(rowLetter + "" + seat + " ");
            }

            // Move to the next line after all the seats of one row
            System.out.println();
        }

        // Print the total number of seats
        int totalSeats = numRows * seatsPerRow;
        System.out.println("Total seats: " + totalSeats);
    }
}
