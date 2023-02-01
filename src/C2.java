import java.util.Scanner;


public class C2 {

    public static void C2_1()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius:");
        double celsiusTemp = input.nextDouble();
        double fahrenheitTemp = (9.0 / 5) * celsiusTemp + 32;
        System.out.println( celsiusTemp + "Celsius is " + fahrenheitTemp + " Fahrenheit");
    }

    public static void C2_2()
    {
        final double PI = 3.1415926;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double areaOfcylinder = radius * radius * PI;
        double volume = areaOfcylinder * length;
        System.out.println("The are of cylinder is:" + areaOfcylinder);
        System.out.println("The volume of cylinder is:" + volume);
    }

    public static void C2_3()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the feet:");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.print("The result is:" + meters);
    }

    public static void C2_4()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the pounds:");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.print("The result is:" + kilograms);
    }

    public static void C2_5()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate:");
        double subtotal = input.nextDouble();
        double gratuityOfrate = input.nextDouble() / 100;
        double gratuity = subtotal * gratuityOfrate;
        System.out.print("The gratuity is:" + gratuity + " and the total is:" + (gratuity+subtotal));
    }

    public static void C2_6()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a int between 0 and 1000:");
        int number = input.nextInt();
        int first = number % 10;
        number = number/10;
        int second = number % 10;
        number /= 10;
        int third = number % 10;
        number /= 10;
        int fourth = number % 10;
        System.out.print("The sum of digits is:" + (first + second + third + fourth));
    }

    public static void C2_7()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int minutes = input.nextInt();
        int year = minutes / (365 * 24 * 60);
        int day = (minutes % (365 * 24 * 60)) / (24 * 60);
        System.out.print("The year is:" + year + " and the day is:" + day);
    }

    public static void C2_8()
    {
        //currentHour -= input
    }

    public static void C2_9()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, t:");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        System.out.print("The average acceleration is" + ((v1 - v0) / t));
    }

    public static void C2_10()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water, initial temp, final temp:");
        double amount = input.nextDouble();
        double initial = input.nextDouble();
        double finaltemp = input.nextDouble();
        System.out.print("The energy needed is:" + (amount * (finaltemp - initial) * 4184));
    }

    public static void C2_11()
    {
        int population = 312032486;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = input.nextInt();
        int second = year * 365 * 24 * 60 * 60;
        int add = second / 7 +second / 45;
        int minu = second / 13;
        System.out.print("The population in " + year + " year is:" + (population + add - minu));
    }

    public static void C2_12()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed and acceleration:");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        System.out.print("The minimum runaway length is:" + (speed * speed / (2 * acceleration)));
    }

    public static void C2_13()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money:");
        double money = input.nextDouble();
        double money2 = money * (1 + 0.00417);
        money2 = (money + money2) * (1 + 0.00417);
        money2 = (money + money2) * (1 + 0.00417);
        money2 = (money + money2) * (1 + 0.00417);
        money2 = (money + money2) * (1 + 0.00417);
        money2 = (money + money2) * (1 + 0.00417);
        System.out.print("The account value is:" + money2);
    }

    public static void C2_14()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and height");
        double weight = input.nextDouble() * 0.45359273;
        double height = input.nextDouble() * 0.0254;
        System.out.print("BMI is:" + (weight / (height * height)));
    }

    public static void C2_15()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        System.out.print("Enter x2 and y2");
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        System.out.print("The distance is:" + Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2), 0.5));
    }

    public static void C2_16()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length:");
        double length = input.nextDouble();
        System.out.print("The area of the hexagon is:" + (3 * Math.pow(3, 0.5) * Math.pow(length, 2) / 2 ));
    }

    public static void C2_17()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp and wind speed:");
        double temp = input.nextDouble();
        double speed = input.nextDouble();
        System.out.print("The wind chill index is:" + (35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16)));
    }

    public static void C2_18()
    {
        System.out.println("a   b   Pow(a, b)");
        System.out.println("1   " + "2   " + (int)Math.pow(1, 2));
        System.out.println("2   " + "3   " + (int)Math.pow(2, 3));
        System.out.println("3   " + "4   " + (int)Math.pow(3, 4));
        System.out.println("4   " + "5   " + (int)Math.pow(4, 5));
        System.out.println("5   " + "6   " + (int)Math.pow(5, 6));
    }

    public static void C2_19()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble();
        double l1 = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2), 0.5);
        double l2 = Math.pow(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2), 0.5);
        double l3 = Math.pow(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2), 0.5);
        double s = (l1 + l2 + l3) / 2;
        double area = Math.pow((s * (s - l1) * (s - l2) * (s - l3)), 0.5);
        System.out.print("The area of the triangle is:" + area);
    }

    public static void C2_20()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the balance and interest rate:");
        double balance = input.nextDouble(), interestRate = input.nextDouble() / 100;
        System.out.print("The interest is:" + balance * (interestRate / 1200) * 100);
    }

    public static void C2_21()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount, annual interest rate, years:");
        double investmentAmount = input.nextDouble(), annualInterest = input.nextDouble() / 100, years = input.nextDouble();
        System.out.print("Future value is:" + investmentAmount * Math.pow((1 + annualInterest / 12), years * 12));
    }

    public static void C2_22()
    {
        //nope
    }

    public  static void C2_23()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance, miles per gallon, price per gallon:");
        double drivingSpeed = input.nextDouble(), milesPgallon = input.nextDouble(), pricePgallon = input.nextDouble();
        System.out.print("The cost of driving is:" + drivingSpeed / milesPgallon * pricePgallon);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        C2_23();
    }
}
