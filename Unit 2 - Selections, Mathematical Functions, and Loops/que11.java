// 11. Write a program to find the maximum of three numbers using if-else.

import java.util.Scanner;
public class que11
{
    public static void main (String[] args)
    {
        // To scan the user input
        Scanner sc = new Scanner (System.in);

        // Taking three numbers by user input
        System.out.println("Let's find the maximum of three numbers using if-else");
        System.out.println("Give any Three integer values to compare...");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        // comparing to find maximum of the three numbers
        if (a > b)
        {
            if (a > c)
            {
                System.out.println("Maximum = "+a);
            }
            else
            {
                System.out.println("Maximum = "+c);
            }
        }
        else
        {
            if (b > c)
            {
                System.out.println("Maximum = "+b);
            }
            else
            {
                System.out.println("Maximum = "+c);
            }
        }
        sc.close();
    }
}