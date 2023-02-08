package C6;

import java.util.Scanner;

public class C6_3 {

    public static int reverse(int number)
    {
        String  output = "";
        while (number > 0)
        {
            output = output + number % 10;
            number /= 10;
        }
        return Integer.parseInt(output);
    }

    public static boolean isPalindrome(int number)
    {
        return (number == reverse(number));
    }

    public static void main(String[] args)
    {
        System.out.print("Enter an int:");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        System.out.print(isPalindrome(user) ? "The int is a palindrome" : "The int is not a palindrome");
    }
}
