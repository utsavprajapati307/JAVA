// 12. Implement a calculator using switch statements.

import java.util.Scanner;
public class que12
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);

        // Taking two inputs

        System.out.println("Let's Implement a calculator using switch statments...");
        System.out.println("Write any two numbers, in which you want to perform arithmetic operations");
        System.out.print("num1 = ");
        double num1 = sc.nextDouble();
        System.out.print("num1 = ");
        double num2 = sc.nextDouble();
        System.out.print("num2 = ");

        System.out.println("Choose an operation : (+, -, *, /)");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator)
        {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                {
                    result = num1 / num2;
                    System.out.println("Result = "+ result);
                }
                else
                {
                    System.out.println("Not defind.");
                }
                
                break;
            default:
            System.out.println("choose valid operator");
        }
        
    }
}