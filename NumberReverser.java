import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        // Prompt the user to enter a number
        System.out.print("Enter any number: ");

        // Read the input from the user
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }

        // Reverse the number and print the result
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);

        // Close the Scanner
        scanner.close();
    }

    // Method to reverse the input number
    public static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        return reversedNum;
    }
}
