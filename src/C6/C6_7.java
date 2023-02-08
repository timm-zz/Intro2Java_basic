package C6;

import java.util.Scanner;

public class C6_7 {
    public static double futureInvestmentValue
            (double investmentAmount, double monthlyInterestRate, int year)
    {
        double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate / 1200), year * 12);
        return futureValue;
    }

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("The amount invested:");
        double amount = input.nextDouble();
        System.out.print("The Annual interest rate:");
        double rate = input.nextDouble();
        System.out.print("Years\t\tFuture Value\n");
        for (int i = 1; i <= 30; i++)
        {
            System.out.printf("%d\t\t\t%.2f\n", i, futureInvestmentValue(amount, rate, i));
        }
    }

}
