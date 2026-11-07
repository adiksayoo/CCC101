public class CashRegisterChangeBreakdown {
    public static void main(String[] args) {

        // Amount due and paid
        int amountDue = 683;
        int amountPaid = 1000;

        // Calculate total change
        int totalChange = amountPaid - amountDue;

        // Track the remaining change
        int remaining = totalChange;

        // Break down change from largest to smallest denomination
        int count500 = remaining / 500;
        remaining %= 500;

        int count100 = remaining / 100;
        remaining %= 100;

        int count50 = remaining / 50;
        remaining %= 50;

        int count20 = remaining / 20;
        remaining %= 20;

        int count10 = remaining / 10;
        remaining %= 10;

        int count5 = remaining / 5;
        remaining %= 5;

        int count1 = remaining / 1;
        remaining %= 1;

        // Verify the breakdown
        int calculatedSum = count500 * 500 + count100 * 100 + count50 * 50
                + count20 * 20 + count10 * 10 + count5 * 5 + count1;

        boolean isSumValid = (calculatedSum == totalChange);

        // Print the change breakdown
        System.out.println("=========================================");
        System.out.println("      CASH REGISTER CHANGE BREAKDOWN");
        System.out.println("=========================================");
        System.out.println("Amount Due         : PHP " + amountDue);
        System.out.println("Amount Paid        : PHP " + amountPaid);
        System.out.println("Total Change       : PHP " + totalChange);
        System.out.println("-----------------------------------------");
        System.out.println("Denomination Breakdown:");
        System.out.println("PHP 500            : " + count500);
        System.out.println("PHP 100            : " + count100);
        System.out.println("PHP 50             : " + count50);
        System.out.println("PHP 20             : " + count20);
        System.out.println("PHP 10             : " + count10);
        System.out.println("PHP 5              : " + count5);
        System.out.println("PHP 1              : " + count1);
        System.out.println("-----------------------------------------");
        System.out.println("Calculated Sum     : PHP " + calculatedSum);
        System.out.println("Sum == Total Change: " + isSumValid);
        System.out.println("=========================================");
    }
}
