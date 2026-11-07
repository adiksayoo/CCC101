/*
 * Program: StudentSheet
 * Description: Displays a student information sheet (name, ID, course and
 *              year level, grades in three subjects, scholarship status)
 *              and computes the student's average grade.
 * Author: Lemuel Alfeo P. Jabajab
 * Date: November 3, 2026
 */
public class StudentSheet {
    public static void main(String[] args) {

        // Student information
        String name = "Michael Davidson";
        String studentId = "2026-0840";
        String course = "Bachelor of Science in Information Technology - 1st Year";

        // Grades
        double understandingTheSelf = 90;
        double purposiveCommunication = 85;
        double discreteStructures = 88;

        // Scholarship status
        boolean scholarshipStatus = true;

        // Compute the average of the three grades
        double averageGrade = (understandingTheSelf + purposiveCommunication + discreteStructures) / 3;

        // Output
        System.out.println("========= STUDENT INFORMATION SHEET =========");
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course/Year: " + course);
        System.out.println("");
        System.out.println("---------------- GRADES ----------------");
        System.out.println("Understanding the self: " + understandingTheSelf);
        System.out.println("Purposive Communication: " + purposiveCommunication);
        System.out.println("Discrete Structures: " + discreteStructures);
        System.out.println("");

        // Round the average to two decimal places
        System.out.printf("Average Grade: %.2f%n", averageGrade);
        System.out.println("Scholarship Status: " + scholarshipStatus);
        System.out.println("=============================================");
    }
}
