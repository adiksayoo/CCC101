public class ScholarshipQualifier {
    public static void main(String[] args) {

        // Student's name and grades
        String studentName = "Michael Dave";
        int math = 88;
        int english = 91;
        int science = 84;
        int programming = 87;

        // Calculate the average of the grades as a double
        double average = (double) (math + english + science + programming) / 4;

        // Average grade is at least 85
        boolean avgCondition = (average >= 85.0);

        // Lowest grade is at least 80
        boolean lowestGradeCondition = (math >= 80 && english >= 80 && science >= 80 && programming >= 80);

        // Determine if the student qualifies for the scholarship based on both
        // conditions
        boolean isQualified = avgCondition && lowestGradeCondition;

        // Print the results in a formatted table
        System.out.println("=========================================");
        System.out.println("          SCHOLARSHIP QUALIFIER");
        System.out.println("=========================================");
        System.out.println("Student Name            : " + studentName);
        System.out.println("Math Grade              : " + math);
        System.out.println("English Grade           : " + english);
        System.out.println("Science Grade           : " + science);
        System.out.println("Programming Grade       : " + programming);
        System.out.println("-----------------------------------------");
        System.out.printf("Exact Average           : %.2f%n", average);
        System.out.println("Average as Integer      : " + (int) average);
        System.out.println("-----------------------------------------");
        System.out.println("Average atleast 85?     : " + avgCondition);
        System.out.println("Lowest Grade atleast 80?: " + lowestGradeCondition);
        System.out.println("-----------------------------------------");
        System.out.println("Qualifies for Scholarship: " + isQualified);
        System.out.println("=========================================");
    }
}
