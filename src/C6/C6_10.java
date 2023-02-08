package C6;

public class C6_10 {
    public static boolean isPrime(int number)
    {
        for (int divisor = 2; divisor <= number / 2; divisor++)
        {
            if (number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 1; i <= 10000; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        System.out.print("The number of prime is " + count);
    }
}
