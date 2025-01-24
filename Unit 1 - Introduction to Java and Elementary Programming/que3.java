// 3. Write a program to demonstrate the use of variables, constants, and data types. 

public class que3
{
    // Declaring a constant (final variable)
    public static final double PI = 3.14159;
    public static void main(String[] args)
    {
        // Declaring and initializing variables of different data types
        int age = 25;                // Integer variable
        double height = 5.9;         // Double variable (for decimal values)
        char grade = 'A';            // Character variable
        boolean isStudent = true;    // Boolean variable

        // Displaying the values of variables and constants
        System.out.println("Age: " + age);                   // Prints an integer
        System.out.println("Height: " + height);             // Prints a double
        System.out.println("Grade: " + grade);               // Prints a character
        System.out.println("Is Student: " + isStudent);      // Prints a boolean
        System.out.println("Value of PI: " + PI);           // Prints a constant

        // Performing some simple arithmetic with variables
        int yearsToRetire = 65 - age; // Calculate years remaining to retire
        System.out.println("Years to retirement: " + yearsToRetire);

        // Example of a String variable
        String message = "Welcome to Java Programming!";
        System.out.println(message); // Prints a string
    }
}
