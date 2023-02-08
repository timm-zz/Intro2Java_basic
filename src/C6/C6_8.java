package C6;

public class C6_8 {

    public static double celsiusToFahrenheit(double celsius)
    {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args)
    {
        System.out.print("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius\n");
        System.out.print("---------------------------------------------\n");
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d\t\t%.1f\t\t|\t%d\t\t\t%.1f\n", (41-i), celsiusToFahrenheit(41-i),
                    (130-10*i), fahrenheitToCelsius(130-10*i));
        }
    }
}
