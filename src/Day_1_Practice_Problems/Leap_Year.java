package Day_1_Practice_Problems;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a year (must be a 4-digit number): ");
            year = scanner.nextInt();

            if (year >= 1000 && year <= 9999) {
                isValid = true;
            }
            else {
                System.out.println("Invalid input. The year must be exactly 4 digits.");
            }
        }

        boolean isLeapYear = false;

        if (year % 400 == 0) {
            isLeapYear = true;
        }
        else if (year % 100 == 0) {
            isLeapYear = false;
        }
        else if (year % 4 == 0) {
            isLeapYear = true;
        }

        System.out.println("--- Result ---");
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        }
        else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}