// 7. Create a program to demonstrate the use of logical operators.

import java.util.Scanner;
public class que7
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);  // To scan

        System.out.println("Demonstrating the use of logical operators...");

        // Input and logic
        System.out.println("Enter true or false for condition 1 : ");
        boolean condition1 = sc.nextBoolean();
        System.out.println("Enter true or false for condition 2 : ");
        boolean condition2 = sc.nextBoolean();

        // Demonstrating the logical operators
        Boolean andresult = condition1 && condition2;
        Boolean orresult = condition1 || condition2;
        Boolean notresult = !condition1;

        // Printing the demonstrated logical operators
        System.out.println("\n Result : ");
        System.out.println("condition 1 AND condition 2 = " + andresult);
        System.out.println("condition 1 OR condition 2 = " + orresult);
        System.out.println("NOT condition 1 = " + notresult);
    }
}