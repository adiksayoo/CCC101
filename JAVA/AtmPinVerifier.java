import java.util.Scanner;

public class AtmPinVerifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The correct PIN is stored in a variable
        int correctPin = 1234;

        int attempts = 0;
        int enteredPin;

        // Do-while loop: asks at least once, repeats while the PIN is wrong and attempts are fewer than 3
        do {
            System.out.print("Enter your PIN: ");
            enteredPin = input.nextInt();
            attempts++;

            // After a wrong PIN, show the remaining attempts (except when the attempts are used up)
            if (enteredPin != correctPin && attempts < 3) {
                int attemptsLeft = 3 - attempts;
                System.out.println("Wrong PIN. Attempts remaining: " + attemptsLeft);
            }
        } while (enteredPin != correctPin && attempts < 3);

        System.out.println();

        // Print the result after the loop
        if (enteredPin == correctPin) {
            System.out.println("Access granted. Welcome!");
        } else {
            System.out.println("Card blocked. Please contact your bank.");
        }
    }
}
