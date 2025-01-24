// 5. Demonstrate type conversion between int, float, and double.

public class que5
{
    public static void main (String[] args)
    {
        // Implicit convertion
        int intval = 11;
        float floatval = (float) intval; // int to float convertion
        double doubleval = (double) intval; // int to double conversion

        // printint implicit converted value
        System.out.println("Implicit conversion : ");
        System.out.println("int to float conversion : "+ floatval);
        System.out.println("int to double convertion : "+ doubleval);

        // Explicite conversion 
        double doublenum = 42.56; 
        float floatnum = (float) doublenum; // double to float conversion
        int intnum = (int) doublenum; // double to int conversion

        // printing explicit converted values
        System.out.println("Explicit convertion :");
        System.out.println("Double to float convertion :"+ floatnum);
        System.out.println("Double to int convertion :"+ intnum);
        
        // Mix type in arithmetic
        int a = 4;
        float b = 4.5f;
        double c = 3.14;

        double result = a + b + c; // int and float are implicitly promoted to double
        System.out.println("Mix type in arithmetic : ");
        System.out.println("Result (int + float + double) : "+ result);
    }
}