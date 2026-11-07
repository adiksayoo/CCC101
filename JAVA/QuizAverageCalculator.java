import java.util.Scanner;

public class QuizAverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the student's name and the number of quizzes
        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of quizzes taken: ");
        int numQuizzes = input.nextInt();

        double total = 0;
        double highest = 0;
        double lowest = 0;

        // For loop: ask for each quiz score and keep a running total
        for (int i = 1; i <= numQuizzes; i++) {
            System.out.print("Enter score for Quiz " + i + ": ");
            double score = input.nextDouble();

            total = total + score;

            // The first score is both the highest and the lowest so far
            if (i == 1) {
                highest = score;
                lowest = score;
            } else {
                if (score > highest) {
                    highest = score;
                }
                if (score < lowest) {
                    lowest = score;
                }
            }
        }

        double average = total / numQuizzes;

        // Print the results after the loop
        System.out.println();
        System.out.println("===== QUIZ SUMMARY =====");
        System.out.println("Student : " + name);
        System.out.printf("Total   : %.2f%n", total);
        System.out.printf("Average : %.2f%n", average);
        System.out.printf("Highest : %.2f%n", highest);
        System.out.printf("Lowest  : %.2f%n", lowest);
    }
}
