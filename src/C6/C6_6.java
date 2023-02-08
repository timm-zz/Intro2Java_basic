package C6;

public class C6_6 {
    public static void displayPattern(int n)
    {
        int blank = n * 2 - 1;
        for (int i = 1; i <= n; i++)
        {
            for (int a = 1; a <= (n - i); a++)
            {
                System.out.print("  ");// print the left blank
            }
            for (int b = i; b > 0; b--)
            {
                System.out.print(b + " ");// print the numbers
            }
            System.out.print("\n");
            blank--;
        }
    }

    public static void main(String[] args)
    {
        displayPattern(5);// has bug when n > 9
    }
}
