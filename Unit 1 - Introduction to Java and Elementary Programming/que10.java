// 10. Write a program to calculate the area of a circle given its radius. 

import java.util.Scanner;

public class que10
{
    public static double PI = 3.14159;
    public static void main (String[] args)
    {
        System.out.println("Let's calculate the area of circle... ");

        // Taking user input
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of circle : ");
        double r = sc.nextFloat();

        // calculating the area of a circle
        double area = PI * r * r;

        // print
        System.out.println("Area of the circle = " + area);
    }
}