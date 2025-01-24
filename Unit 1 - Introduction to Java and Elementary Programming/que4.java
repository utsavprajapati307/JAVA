// 4. Perform arithmetic operations (add, subtract, multiply, divide) on two integers.

import java.util.Scanner;
public class que4
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        // Taking two inetegers from the user
        System.out.println("Enter the first integer : ");
        int A = sc.nextInt();
        System.out.println("Enter the Second integer : ");
        int B = sc.nextInt();

        // Performimg the operations
        int sum = A + B ;
        int sub = A - B ;
        int mul = A * B ;
        double div = (B != 0)? (double) A/B : Double.NaN;

        // Display results
        System.out.println("Sum of two integers = "+sum);
        System.out.println("Substraction of two integers = "+sub);
        System.out.println("Multiplication of two integers = "+mul);
        if (B != 0)
        {
            System.out.println ("Division :" + div);
        }
        else
        {
            System.out.println("Division : Undefined");
        }
    
    }
}