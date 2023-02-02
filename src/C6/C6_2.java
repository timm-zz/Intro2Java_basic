package C6;

import java.util.Scanner;

public class C6_2 {
    public static int sumDigits(long n)
    {
        int result = 0;
        while (n != 0)
        {
            result += n%10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.print("Enter an int:");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        System.out.print(sumDigits(user));
    }
}
