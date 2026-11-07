import java.util.Scanner;

public class EntranceExamScreening {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validCount = 0;
        int passedCount = 0;
        double total = 0;

        // For loop goes through up to 10 applicants
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for applicant " + i + ": ");
            int score = input.nextInt();

            // Break stops the screening immediately when the clerk types 999
            if (score == 999) {
                System.out.println("Screening ended early.");
                break;
            }

            // Continue skips an invalid score so it is not counted or added
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Skipped.");
                continue;
            }

            // Valid score: add it to the total and count it
            total = total + score;
            validCount++;

            // Print whether the applicant passed or failed
            if (score >= 75) {
                System.out.println("Passed");
                passedCount++;
            } else {
                System.out.println("Failed");
            }
        }

        // Print the results after the loop
        System.out.println();
        System.out.println("===== SCREENING RESULTS =====");
        if (validCount == 0) {
            System.out.println("No valid scores.");
        } else {
            double average = total / validCount;
            System.out.println("Valid scores : " + validCount);
            System.out.println("Passed       : " + passedCount);
            System.out.printf("Average      : %.2f%n", average);
        }
    }
}
