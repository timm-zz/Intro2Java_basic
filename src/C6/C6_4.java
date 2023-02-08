package C6;

import java.util.Scanner;

public class C6_4 {

    public static void reverse(int number)
    {
        String  output = "";
        while (number > 0)
        {
            output = output + number % 10;
            number /= 10;
        }
        System.out.print(Integer.parseInt(output));
    }

    public static void main(String[] args)
    {
        System.out.print("Enter an int:");
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        reverse(user);
    }

}
