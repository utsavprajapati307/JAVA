// 8. Write a program to check if a given year is a leap year.

import java.util.Scanner;

public class que8
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0)
        {
            System.out.println("The year " + year + "is a leap year");
        }
        else
        {
            System.out.println("The year " + year + "is not a leap year");
        }
        sc.close();
    }
}