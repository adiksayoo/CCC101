import java.util.Scanner;

public class ProgramCodeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validCount = 0;

        // Keep asking until the user types EXIT
        while (true) {
            System.out.print("Enter a program code (or EXIT to stop): ");
            String code = input.nextLine().trim().toUpperCase();

            // Break leaves the loop when the user types EXIT
            if (code.equals("EXIT")) {
                break;
            }

            // Continue skips the rest of the loop when the input is empty
            if (code.equals("")) {
                continue;
            }

            // Switch with grouped cases: codes in the same department share one message
            switch (code) {
                case "BSCS":
                case "BSIT":
                case "BSIS":
                    System.out.println("Computing Department");
                    validCount++;
                    break;
                case "BSEE":
                case "BSCE":
                case "BSME":
                    System.out.println("Engineering Department");
                    validCount++;
                    break;
                case "BSBIO":
                case "BSCHEM":
                case "BSMATH":
                    System.out.println("Science Department");
                    validCount++;
                    break;
                default:
                    System.out.println("Unknown program code.");
            }
        }

        // Print the count of valid codes when the user exits
        System.out.println("Valid codes found: " + validCount);
    }
}
