package C6;

public class C6_9 {
    public static double footToMeter(double foot)
    {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter)
    {
        return 3.279 * meter;
    }

    public static void main(String[] args)
    {
        System.out.print("Feet\tMeters\t|\tMeters\tFeet\n");
        System.out.print("---------------------------------------------\n");
        for (double i = 1; i <= 10; i++)
        {
            System.out.printf("%.1f\t\t%.3f\t\t|\t%.1f\t\t%.3f\n", i, footToMeter(i),
                    (15 + 5*i), meterToFoot(15 + 5*i));
        }
    }

}
