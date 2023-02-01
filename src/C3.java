import java.util.Scanner;

public class C3 {

    public static void C3_1()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        double judge =  Math.pow((b * b - 4 * a * c), 0.5);
        double b1 = (-b + judge) / (2 * a);
        if (judge > 0)
        {
            double b2 = (-b - judge) / (2 * a);
            System.out.print("The equation has two roots as:" + b1 + ", " + b2);
        }
        else if (judge == 0)
        {
            System.out.print("The equation has one root as:" + b1 );
        }
        else
        {
            System.out.print("The equation has no roots");
        }
    }

    public static void C3_2()
    {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("What's the answer of " + a + " + " + b + " + " + c + " ?");
        int answer = input.nextInt();
        System.out.print("The answer " + answer + " is " + (answer == a + b +c) );
    }

    public static void C3_3()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f:");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        double d = input.nextDouble(), e = input.nextDouble(), f = input.nextDouble();
        double bottom = a * d - b * c;
        if (bottom == 0)
        {
            System.out.print("The equation his no solution");
        }
        else
        {
            System.out.print("X is "+ ((e * d - b * f) / bottom ) + " and Y is " + ((a * f - e * c) / bottom));
        }
    }

    public static void C3_4()
    {
        int monthIndex = (int)(Math.random() * 100) % 12 + 1;
        switch (monthIndex - 1)
        {
            case 0: System.out.print("The number " + monthIndex+ " is Jan.");break;
            case 1: System.out.print("The number " + monthIndex+ " is Feb.");break;
            case 2: System.out.print("The number " + monthIndex+ " is Mar.");break;
            case 3: System.out.print("The number " + monthIndex+ " is Apr.");break;
            case 4: System.out.print("The number " + monthIndex+ " is May.");break;
            case 5: System.out.print("The number " + monthIndex+ " is June.");break;
            case 6: System.out.print("The number " + monthIndex+ " is July.");break;
            case 7: System.out.print("The number " + monthIndex+ " is Aug.");break;
            case 8: System.out.print("The number " + monthIndex+ " is Sept.");break;
            case 9: System.out.print("The number " + monthIndex+ " is Oct.");break;
            case 10: System.out.print("The number " + monthIndex+ " is Nov.");break;
            case 11: System.out.print("The number " + monthIndex+ " is Dec.");break;
        }
    }

    public static void C3_5()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day:");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int number = (input.nextInt() + today) % 7;
        switch (today)
        {
            case 0: System.out.print("This is Sun.");break;
            case 1: System.out.print("This is Mon.");break;
            case 2: System.out.print("This is Tues.");break;
            case 3: System.out.print("This is Wed.");break;
            case 4: System.out.print("This is Thur.");break;
            case 5: System.out.print("This is Fri.");break;
            case 6: System.out.print("This is Sat.");break;
        }
        switch (number)
        {
            case 0: System.out.print(" and the future day is Sun.");break;
            case 1: System.out.print(" and the future day is Mon.");break;
            case 2: System.out.print(" and the future day is Tues.");break;
            case 3: System.out.print(" and the future day is Wen.");break;
            case 4: System.out.print(" and the future day is Thur.");break;
            case 5: System.out.print(" and the future day is Fri.");break;
            case 6: System.out.print(" and the future day is Sat.");break;
        }

    }

    public static void C3_6()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight, feet, inch:");
        double weight = input.nextDouble() * 0.45359273;
        double feet = input.nextDouble() * 0.3048;
        double height = input.nextDouble() * 0.0254 + feet;
        double bmi = (weight / (height * height));
        System.out.println("BMI is:" + bmi);
        if (bmi < 18.5)
        {
            System.out.print("Underweight");
        }
        else if (bmi < 25)
        {
            System.out.print("Normal");
        }
        else if (bmi < 30)
        {
            System.out.print("Overweight");
        }
        else
        {
            System.out.print("Obese");
        }
    }

    public static void C3_7()
    {
        //pass, use % and if
    }

    public static void C3_8()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three ints:");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if ( a > b )
        {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.print("The result is " + a + b + c);
    }

    public static void C3_9()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer");
        int initial = input.nextInt();
        int last = (initial % 10 * 9 + initial / 10 % 10 * 8 + initial / 100 % 10 * 7 +
                initial / 1000 % 10 * 6 + initial / 10000 % 10 * 5 + initial / 100000 % 10 * 4 +
                initial / 1000000 % 10 * 3 + initial / 10000000 % 10 * 2 + initial / 100000000 % 10 * 1) % 11;
        if (last == 10)
        {
            System.out.print("The ISBN-10 number is 0" + initial + "X");
        }
        else
        {
            System.out.print("The ISBN-10 number is 0" + initial + last);
        }
    }

    public static void C3_10()
    {
        int number1 = (int)(Math.random() * 100);
        int number2 = number1 + (int)(Math.random() * 100); // Make sure number2 is bigger than number1
        Scanner input = new Scanner(System.in);
        System.out.print("The answer of " + number2 + " - " + number1 + " is?");
        int answer = input.nextInt();
        if (answer == number2 - number1)
        {
            System.out.print("Your answer is right!");
        }
        else
        {
            System.out.print("You are wrong, the correct answer is " + (number2 - number1));
        }
    }

    public static void C3_11()
    {
        //use switch
    }

    public static void C3_12()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer:");
        int integer = input.nextInt();
        if ((integer % 10) == (integer / 100))
        {
            System.out.print(integer + " is a palindrome");
        }
        else
        {
            System.out.print(integer + " is not a palindrome");
        }
    }

    public static void C3_13()
    {
        // too complex
    }

    public static void C3_14()
    {
        Scanner input = new Scanner(System.in);
        int coin = Math.random() > 0.5 ? 1: 0;
        System.out.print("Guess the coin:");
        int guess = input.nextInt();
        System.out.print(guess == coin ? "You are right": "You are wrong");
    }

    public static void C3_15()
    {
        int lottery = (int)(Math.random() * 1000);
        //System.out.println(lottery);
        int lottery1 = lottery % 10, lottery2 = lottery / 10 % 10, lottery3 = lottery / 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number");
        int user = input.nextInt();
        int user1 = user % 10, user2 = user / 10 % 10, user3 = user / 100;
        if (user == lottery)
        {
            System.out.print("You won $10000");
        }
        else if ((user1 == lottery1 && user2 == lottery2 && user3 == lottery3) ||
                (user1 == lottery2 && user2 == lottery1 && user3 == lottery3) ||
                (user1 == lottery2 && user2 == lottery3 && user3 == lottery1) ||
                (user1 == lottery1 && user2 == lottery3 && user3 == lottery2) ||
                (user1 == lottery3 && user2 == lottery1 && user3 == lottery2) ||
                (user1 == lottery3 && user2 == lottery2 && user3 == lottery1))
        {
            System.out.print("You won $3000");
        }
        else if ((user1 == lottery1 || user1 == lottery2 || user1 == lottery3) ||
                (user2 == lottery2 || user2 == lottery1 || user2 == lottery3) ||
                (user3 == lottery2 || user3 == lottery3 || user3 == lottery1))
        {
            System.out.print("You won $1000");
        }
        else
        {
            System.out.print("None");
        }
    }

    public static void C3_16()
    {
        int x = Math.random() > 0.5 ? (int)(0 + Math.random() * 100 % 50): -(int)(0 + Math.random() * 100 % 50);
        int y = Math.random() > 0.5 ? (int)(0 + Math.random() * 100 % 100): -(int)(0 + Math.random() * 100 % 100);
        System.out.print("The coordinate is (" + x +", " + y + ")");
    }

    public static void C3_17()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number(0 for rock, 1 for scissor, 2 for paper):");
        int user = input.nextInt();
        int computer = (int)(Math.random() * 10) % 3;
        // this if-structure is suck.
        if (user == 0)
        {
            if (computer == 0)
            {
                System.out.print("The computer is rock and you is rock, it's a draw!");
            }
            else if (computer == 1)
            {
                System.out.print("The computer is scissor and you is rock, you won!");
            }
            else if (computer == 2)
            {
                System.out.print("The computer is paper and you is rock, you lose!");
            }
        }
        else if (user == 1)
        {
            if (computer == 0)
            {
                System.out.print("The computer is rock and you is scissor, you lose!");
            }
            else if (computer == 1)
            {
                System.out.print("The computer is scissor and you is scissor, it's a draw!");
            }
            else if (computer == 2)
            {
                System.out.print("The computer is paper and you is scissor, you won!");
            }
        }
        else if (user == 2)
        {
            if (computer == 0)
            {
                System.out.print("The computer is rock and you is paper, you won!");
            }
            else if (computer == 1)
            {
                System.out.print("The computer is scissor and you is paper, you lose!");
            }
            else if (computer == 2)
            {
                System.out.print("The computer is paper and you is paper, it's a draw!");
            }
        }

    }

    public static void C3_18()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight:");
        double user = input.nextDouble();
        if (user <= 0)
        {
            System.out.print("Invalid input");
        }
        else if (user <= 1)
        {
            System.out.print("The cost is 3.5 per pound");
        }
        else if (user <= 3)
        {
            System.out.print("The cost is 5.5 per pound");
        }
        else if (user <= 10)
        {
            System.out.print("The cost is 8.5 per pound");
        }
        else if(user <= 20)
        {
            System.out.print("The cost is 10.5 per pound");
        }
        else
        {
            System.out.print("The package cannot be shipped");
        }
    }

    public static void C3_19()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of sides");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        if (a + b > c && a + c > b && b + c > a)
        {
            System.out.print("The perimeter is "+ (a + b +c));
        }
        else
        {
            System.out.print("Invalid input");
        }
    }

    public static void C3_20()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp and wind speed:");
        double temp = input.nextDouble();
        double speed = input.nextDouble();
        if (temp >= -58 && temp <= 41 && speed >= 2)
        {
            System.out.print("The wind chill index is:" + (35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16)));
        }
        else
        {
            System.out.print("Invalid input");
        }

    }

    public static void C3_21()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year, month, day:");
        int year = input.nextInt(), month = input.nextInt(), day = input.nextInt();
        if (month == 1)
        {
            month = 13;
            year -= 1;
        }
        else if (month == 2)
        {
            month = 14;
            year -= 1;
        }
        int h = (day + (26 * (month + 1)) / 10 + year % 100 + (year % 100) / 4 + year / 100 / 4 + 5 * (year / 100)) % 7;
        switch (h)
        {
            case 0: System.out.print("This is Sat.");break;
            case 1: System.out.print("This is Sun.");break;
            case 2: System.out.print("This is Mon.");break;
            case 3: System.out.print("This is Thue.");break;
            case 4: System.out.print("This is Wen.");break;
            case 5: System.out.print("This is Thur.");break;
            case 6: System.out.print("This is Fri.");break;
        }
    }

    public static void C3_22()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double distance = Math.pow(Math.pow(x1 - 0,2) + Math.pow(y1 - 0,2), 0.5);
        if (distance < 10)
        {
            System.out.print("The point is in the circle");
        }
        else
        {
            System.out.print("The point isn't in the circle");
        }
    }

    public static void C3_23()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates");
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        if (x1 > -5 && x1 < 5 && y1 > -2.5 && y1 < 2.5)
        {
            System.out.print("The point is in the rectangle");
        }
        else
        {
            System.out.print("The point is not in the rectangle");
        }
    }

    public static void C3_24()
    {
        // Math.Random && switch
    }

    public static void C3_25()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble();
        double x3 = input.nextDouble(), y3 = input.nextDouble(), x4 = input.nextDouble(), y4 = input.nextDouble();
        double a = y1 - y2, b = x1 - x2, c = y3 - y4, d = x3 - x4;
        double e = a * x1 - b * y1, f = c * x3 - d * y3;
        double bottom = a * d - b * c;
        if (bottom == 0)
        {
            System.out.print("This two lines are parallel");
        }
        else
        {
            System.out.print("The intersecting point is at ("+ ((e * d - b * f) / bottom ) + ((a * f - e * c) / bottom) + ")");
        }
    }

    public static void C3_26()
    {
        //pass
    }

    public static void C3_27()
    {
        //y = 100 -0.5x
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point:");
        double x = input.nextDouble(), y = input.nextDouble();
        if (x > 0 && y > 0 && (100 - 0.5*x) > y)
        {
            System.out.print("This point is in the triangle");
        }
        else
        {
            System.out.print("This point is not in the triangle");
        }
    }

    public static void C3_28()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, weight1, height1, x2, y2, weight2, height2:");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), weight1 = input.nextDouble() / 2, height1 = input.nextDouble() / 2;
        double x2 = input.nextDouble(), y2 = input.nextDouble(), weight2 = input.nextDouble() / 2, height2 = input.nextDouble() / 2;
        if ((x2 - weight2 >= x1 - weight1) && (x2 + weight2 <= x1 + weight1) && (y2 - height2 >= y1 - height1) && (y2 + height2 <= y1 + height1))
        {
            System.out.print("r2 is inside r1");
        }
        else if((x2 - weight2 > x1 + weight1) || (x2 + weight2 < x1 - weight1) || (y2 - height2 > y1 + height1) || (y2 + height2 < y1 - height1))
        {
            System.out.print("r2 does not overlap r1 ");
        }
        else
        {
            System.out.print("r2  overlaps r1 ");
        }
    }

    public static void C3_29()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, weight1, height1, x2, y2, weight2, height2:");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), radius1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble(), radius2 = input.nextDouble();
        double min = radius2 - radius1 > 0 ? radius2 - radius1: radius1 - radius2;
        double add = radius1 + radius2;
        double distance = Math.pow((Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)), 0.5);
        if (distance <= min)
        {
            System.out.print("C2 is inside C1");
        }
        else if (distance <= add)
        {
            System.out.print("C2 overlaps C1");
        }
        else
        {
            System.out.print("C2 does not overlap C1");
        }

    }

    public static void C3_30()
    {
        //hour = hour % 12
    }

    public static void C3_31()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB:");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int choice = input.nextInt();
        if (choice == 0)
        {
            System.out.print("Enter the RMB amount:");
            double rmbamount = input.nextDouble();
            System.out.print(rmbamount + " yuan is $" + (rmbamount / rate));
        }
        else if (choice == 1)
        {
            System.out.print("Enter the dollar amount:");
            double dollaramount = input.nextDouble();
            System.out.print("$" + dollaramount + " dollar is " + (dollaramount * rate));
        }
        else
        {
            System.out.print("Incorrect input");
        }
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
        C3_31();
    }
}
