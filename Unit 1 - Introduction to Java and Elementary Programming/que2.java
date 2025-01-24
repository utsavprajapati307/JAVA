// 2. Create a program to take input for your name and display "Welcome, [name]". 

import java.util.Scanner;

public class que2
{
    public static void main (String args [])
    {
        System.out.print ("Enter your name : ");
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        System.out.print ("Welcome, " + name);
    }
}