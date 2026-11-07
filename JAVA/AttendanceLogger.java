import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AttendanceLogger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the number of students present
        System.out.print("Enter number of students present: ");
        int count = input.nextInt();
        input.nextLine(); // consume leftover Enter

        // Ask for the name of each student
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        // Write to the file. FileWriter without "true" OVERWRITES the file.
        // I chose to overwrite because the file should hold only today's
        // attendance. Appending would mix it with the previous run's list.
        try (PrintWriter writer = new PrintWriter(new FileWriter("attendance.txt"))) {
            writer.println("Attendance for Programming 101");
            for (int i = 0; i < count; i++) {
                writer.println(names[i]);
            }
            System.out.println();
            System.out.println("Attendance saved.");
        } catch (IOException e) {
            System.out.println("Error: cannot write to the file.");
        }

        // Read the file back and display everything
        System.out.println();
        System.out.println("===== SAVED ATTENDANCE =====");
        try (BufferedReader reader = new BufferedReader(new FileReader("attendance.txt"))) {
            String line = reader.readLine();
            int lineCount = 0;

            while (line != null) {
                System.out.println(line);
                lineCount++;
                line = reader.readLine();
            }

            // The title line is not counted as a student
            int students = lineCount - 1;
            System.out.println("============================");
            System.out.println("Number of students recorded: " + students);
        } catch (FileNotFoundException e) {
            System.out.println("Error: attendance.txt was not found.");
        } catch (IOException e) {
            System.out.println("Error: cannot read the file.");
        }
    }
}
