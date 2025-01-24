// 6. Write a program to evaluate an expression with operator precedence.

import java.util.Scanner;
public class que6
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        // Taking the values of variables for an expression
        System.out.println("Let's Calculate an arithmetic equation and observe operator precedance...");
        System.out.println("To evaluate the expression, Give the values of...");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        System.out.print("d = ");
        int d = sc.nextInt();

        // Evaluating the expression with operator precedence
        int result = a + b - c * d / c;

        // printing the expression and its value
        System.out.println("Expression : a + b - c * d / c");
        System.out.println("Values : \n a = " + a + "\n b = " + b + "\n c = " + c + "\n d = " + d);
        System.out.println("Result = " + result);
    }
}