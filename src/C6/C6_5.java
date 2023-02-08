package C6;

import java.util.Scanner;

public class C6_5 {
    public static void disaplaySortedNumbers
            (double num1, double num2, double num3)
    {
        double temp = 0;
        if (num1 < num2)
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3)
        {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2)
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.printf("%f %f %f", num1, num2, num3);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter three numbers:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        disaplaySortedNumbers(num1, num2, num3);
    }


}
