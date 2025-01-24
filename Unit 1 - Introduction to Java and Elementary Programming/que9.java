// 9. Implement a program to swap two numbers using a third variable and without using a third variable.

import java.util.Scanner;

public class que9
{
    public static void main (String[] args)
    {
        // Input two numbers from the user

        Scanner sc = new Scanner (System.in);
        System.out.println("Write any two integer numbers : ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        
        // giving options to the user for choise

        System.out.println("Choose swapping method : \n1: Using third variable \n2: Without using third variale");
        int choise = sc.nextInt();

        switch(choise)
        {
            case 1:
                // swap using third variable
                int temp = a;
                a = b;
                b = temp;
                // printing the swapped numbers by third variable method
                System.out.println("After swapping (using third variable method) : \na = " + a + "\nb = "+ b );
                break;

            case 2:
            
                
                a = a + b;
                b = a - b;
                a = a - b;
                
                System.out.println("After swapping (without using third variable method) : \na = " + a + "\nb = "+ b );
                break;
            default:

            System.out.println("Invalid choise. Please choose 1 or 2.");
        }
        sc.close();
    }
}