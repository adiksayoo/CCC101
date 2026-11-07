import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeLookUp {
    public static void main(String[] args) {
        String[] names = {"Ana Reyes", "Ben Santos", "Carla Lim", "Dino Cruz", "Ella Tan"};
        int[] grades = {88, 92, 75, 81, 95};

        Scanner input = new Scanner(System.in);

        try {
            // Ask for the record number (1 to 5)
            System.out.print("Enter record number (1-5): ");
            int recordNo = input.nextInt();

            // Record numbers start at 1, but array indexes start at 0.
            // A number outside 1-5 makes this line throw ArrayIndexOutOfBoundsException.
            String name = names[recordNo - 1];
            int oldGrade = grades[recordNo - 1];

            System.out.println("Student: " + name);
            System.out.println("Current grade: " + oldGrade);

            // Read the new grade as text first, then convert it
            System.out.print("Enter new grade: ");
            String gradeText = input.next();
            int newGrade = Integer.parseInt(gradeText);

            // Reject grades outside 0-100 by throwing an exception
            if (newGrade < 0 || newGrade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }

            // Everything is valid: update the array and show the result
            grades[recordNo - 1] = newGrade;
            System.out.println(name + ": old grade = " + oldGrade + ", new grade = " + newGrade);

        } catch (InputMismatchException e) {
            // Needed because nextInt() throws this when the record number
            // is not a whole number (for example, letters).
            System.out.println("Invalid input. The record number must be a whole number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Needed because there are only 5 records, so any number
            // outside 1-5 points to a spot that does not exist.
            System.out.println("Invalid record number. Please choose from 1 to 5.");
        } catch (NumberFormatException e) {
            // Needed because Integer.parseInt() throws this when the new
            // grade text is not a valid whole number.
            System.out.println("Invalid grade. The new grade must be a whole number.");
        } catch (IllegalArgumentException e) {
            // Needed to catch our own thrown exception for grades outside 0-100
            // and to display its custom message.
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Record lookup closed.");
        }
    }
}
