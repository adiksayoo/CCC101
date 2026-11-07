import java.util.Scanner;

public class LibraryBorrowingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the student's information
        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Valid library card? (Y/N): ");
        String hasCard = input.next();

        System.out.print("Enter unpaid fines: ");
        double unpaidFines = input.nextDouble();

        System.out.print("Enter number of books currently borrowed: ");
        int booksBorrowed = input.nextInt();

        System.out.println();

        // Nested if-else: check 1 is the card, check 2 is the fines, check 3 is the books
        if (hasCard.equalsIgnoreCase("Y")) {
            if (unpaidFines == 0) {
                if (booksBorrowed < 5) {
                    int booksLeft = 5 - booksBorrowed;
                    System.out.println(name + ", you may borrow a book.");
                    System.out.println("You can borrow " + booksLeft + " more book(s).");
                } else {
                    System.out.println("Borrowing limit reached. Please return a book first.");
                }
            } else {
                System.out.printf("You have unpaid fines of PHP %,.2f. Please pay them first.%n", unpaidFines);
            }
        } else {
            System.out.println("Please apply for a library card first.");
        }
    }
}
