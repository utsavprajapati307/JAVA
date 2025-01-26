// 14. Generate the multiplication table for a number using a loop.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Generate and display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
