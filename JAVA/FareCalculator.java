import java.util.Scanner;

public class FareCalculator {
    public static void main(String[] args) {
        // Constants for the boarding fee and the rate per kilometer
        final double boardingFee = 10.00;
        final double ratePerKm = 2.50;

        Scanner input = new Scanner(System.in);

        // Ask for the group leader's name, the distance, and the passengers
        System.out.print("Enter group leader's name: ");
        String leader = input.nextLine();

        System.out.print("Enter distance in kilometers: ");
        double distance = input.nextDouble();

        System.out.print("Enter number of passengers: ");
        int passengers = input.nextInt();

        /*
         * Formula used:
         * Fare per passenger = boarding fee + (rate per km x distance)
         * Total fare = fare per passenger x number of passengers
         * The same trip applies to every passenger.
         */
        double farePerPassenger = boardingFee + (ratePerKm * distance);
        double totalFare = farePerPassenger * passengers;

        // Print the trip receipt
        System.out.println();
        System.out.println("===== TRIP RECEIPT =====");
        System.out.println("Group Leader       : " + leader);
        System.out.println("Distance           : " + distance + " km");
        System.out.println("Passengers         : " + passengers);
        System.out.printf("Fare per Passenger : PHP %,.2f%n", farePerPassenger);
        System.out.printf("Total Fare         : PHP %,.2f%n", totalFare);
    }
}
