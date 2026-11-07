import java.util.Scanner;

public class EnrollmentAssessmentSlip {
    public static void main(String[] args) {
        // Constants for the tuition per unit and the miscellaneous fee
        final double ratePerUnit = 200.00;
        final double miscFee = 1500.00;

        Scanner input = new Scanner(System.in);

        // Ask for the student's information
        System.out.print("Enter year level: ");
        int yearLevel = input.nextInt();

        System.out.print("Enter number of units enrolled: ");
        int numUnits = input.nextInt();
        input.nextLine(); // consume leftover Enter

        System.out.print("Enter full name: ");
        String name = input.nextLine();

        System.out.print("Enter degree program: ");
        String degreeProgram = input.nextLine();

        // Compute the tuition and the total assessment
        double tuition = numUnits * ratePerUnit;
        double total = tuition + miscFee;

        // Print the assessment slip
        System.out.println();
        System.out.println("===== ENROLLMENT ASSESSMENT SLIP =====");
        System.out.println("Name          : " + name);
        System.out.println("Program       : " + degreeProgram);
        System.out.println("Year Level    : " + yearLevel);
        System.out.println("Units         : " + numUnits);
        System.out.printf("Tuition       : PHP %,.2f%n", tuition);
        System.out.printf("Miscellaneous : PHP %,.2f%n", miscFee);
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL         : PHP %,.2f%n", total);
    }
}
