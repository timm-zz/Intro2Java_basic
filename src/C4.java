import java.util.Scanner;

public class C4 {

    public static void C4_1()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex");
        double radius = input.nextDouble();
        double side = 2 * radius * Math.sin(Math.PI / 5.0);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5.0));
        System.out.printf("The area of the pentagon is %6.2f", area);
    }

    public static void C4_2()
    {
        //39.55 -116.25 41.5 87.37
        final double RADIUS = 6371.01;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the point1 and point2");
        double x1 = Math.toRadians(input.nextDouble()), y1 = Math.toRadians(input.nextDouble());
        double x2 = Math.toRadians(input.nextDouble()), y2 = Math.toRadians(input.nextDouble());
        double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.printf("The distance between the two points is %f km", d);
    }

    public static void C4_3()
    {
        //pass
    }

    public static void C4_4_5()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides ands side:");
        double number = input.nextDouble(), side = input.nextDouble();
        double numerator = number * Math.pow(side, 2);
        double denominator = 4 * Math.tan(Math.PI / number);
        double area = numerator / denominator;
        System.out.printf("The area of the polygon is: %6.3f", area);
    }

    public static void C4_6()
    {
        final double RADIUS = 40;
        double degreeA = Math.random() * 2 * Math.PI;
        double degreeB = Math.random() * 2 * Math.PI;
        double degreeC = Math.random() * 2 * Math.PI;
        double pointAx = RADIUS * Math.cos(degreeA), pointAy = RADIUS * Math.sin(degreeA);
        double pointBx = RADIUS * Math.cos(degreeB), pointBy = RADIUS * Math.sin(degreeB);
        double pointCx = RADIUS * Math.cos(degreeC), pointCy = RADIUS * Math.sin(degreeC);
        double sideA = Math.pow(Math.pow(pointBx - pointCx,2) + Math.pow(pointBy - pointCy,2), 0.5);
        double sideB = Math.pow(Math.pow(pointAx - pointCx,2) + Math.pow(pointAy - pointCy,2), 0.5);
        double sideC = Math.pow(Math.pow(pointBx - pointAx,2) + Math.pow(pointBy - pointAy,2), 0.5);
        double pointA = Math.toDegrees(Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC)));
        double pointB = Math.toDegrees(Math.acos((sideA * sideA + sideC * sideC - sideB * sideB) / (2 * sideA * sideC)));
        double pointC = Math.toDegrees(Math.acos((sideA * sideA + sideB * sideB - sideC * sideC) / (2 * sideA * sideB)));
        System.out.printf("The three angle is %f, %f, %f", pointA, pointB, pointC);
    }

    public static void C4_7()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of bounding circle:");
        double radius = input.nextDouble();
        double point1x = radius * Math.cos(Math.toRadians(18)), point1y = radius * Math.sin(Math.toRadians(18));
        double point2x = 0.00, point2y = radius;
        double point3x = - point1x, point3y = point1y;
        double point4x = -radius * Math.cos(Math.toRadians(54)), point4y = -radius * Math.sin(Math.toRadians(54));
        double point5x = radius * Math.cos(Math.toRadians(54)), point5y = point4y;
        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%.2f, %.2f)\n", point1x, point1y);
        System.out.printf("(%.2f, %.2f)\n", point2x, point2y);
        System.out.printf("(%.2f, %.2f)\n", point3x, point3y);
        System.out.printf("(%.2f, %.2f)\n", point4x, point4y);
        System.out.printf("(%.2f, %.2f)", point5x, point5y);
    }

    public static void C4_8()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code:");
        int code = input.nextInt();
        System.out.printf("The character for ASCII code %d is %c",code, (char)code);
    }

    public static void C4_9()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character:");
        String code = input.nextLine();
        System.out.printf("The ASCII code for character %c is %d",code.charAt(0), (int)code.charAt(0));
    }

    public static void C4_10()
    {
        //use if
    }

    public static void C4_11()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num[0, 15]:");
        int num = input.nextInt();
        if (num >= 0 && num < 10)
        {
            System.out.println("The hex value is " + num);
        }
        else if (num >=10 && num <= 15)
        {
            switch (num)
            {
                case 10: System.out.println("The hex value is A");break;
                case 11: System.out.println("The hex value is B");break;
                case 12: System.out.println("The hex value is C");break;
                case 13: System.out.println("The hex value is D");break;
                case 14: System.out.println("The hex value is E");break;
                case 15: System.out.println("The hex value is F");break;

            }
        }
        else
        {
            System.out.println(num + " is an invalid input");
        }


    }

    public static void C4_12()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit:");
        String num = input.next().toUpperCase();
        int bin0 = 0;
        int bin1 = 0;
        int bin2 = 0;;
        int bin3 = 0;;
        if (num.length() != 1)
        {
            System.out.println(num + " is an invalid input");
        }
        else if (num.charAt(0) >= 'A' && num.charAt(0) <= 'F')
        {
            int temp = (int)num.charAt(0) - 55;
            bin0 = (temp % 2);
            temp /= 2;
            bin1 = (temp % 2);
            temp /= 2;
            bin2 = (temp % 2);
            temp /= 2;
            bin3 = (temp % 2);
            System.out.printf("The binary value is %d%d%d%d",bin3, bin2, bin1, bin0);
        }
        else if(num.charAt(0) >= '0' && num.charAt(0) <= '9')
        {
            int temp = (int)num.charAt(0);
            bin0 = (temp % 2);
            temp /= 2;
            bin1 = (temp % 2);
            temp /= 2;
            bin2 = (temp % 2);
            temp /= 2;
            bin3 = (temp % 2);
            System.out.printf("The binary value is %d%d%d%d",bin3, bin2, bin1, bin0);
        }
        else
        {
            System.out.println(num + " is an invalid input");
        }

    }

    public static void C4_13()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter:");
        String num = input.next();
        if (Character.isLetter(num.charAt(0)))
        {
            switch (Character.toUpperCase(num.charAt(0)))
            {
                case 'A', 'E', 'O', 'I', 'U':System.out.printf("%c is a vowel", num.charAt(0));break;
                default:System.out.printf("%c is a consonant", num.charAt(0));
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }

    public static void C4_14()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade:");
        String num = input.next();
        switch (num.charAt(0))
        {
            case 'A': System.out.printf("The numeric value for grade %c is %d", num.charAt(0), 4);break;
            case 'B': System.out.printf("The numeric value for grade %c is %d", num.charAt(0), 3);break;
            case 'C': System.out.printf("The numeric value for grade %c is %d", num.charAt(0), 2);break;
            case 'D': System.out.printf("The numeric value for grade %c is %d", num.charAt(0), 1);break;
            case 'F': System.out.printf("The numeric value for grade %c is %d", num.charAt(0), 0);break;
            default:System.out.printf("%c is a Invalid input", num.charAt(0));break;
        }
    }

    public static void C4_15()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter:");
        String num = input.next();
        switch (Character.toLowerCase(num.charAt(0)))
        {
            case 'a', 'b', 'c': System.out.printf("The corresponding number is 2");break;
            case 'd', 'e', 'f': System.out.printf("The corresponding number is 3");break;
            case 'g', 'h', 'i': System.out.printf("The corresponding number is 4");break;
            case 'j', 'k', 'l': System.out.printf("The corresponding number is 5");break;
            case 'm', 'n', 'o': System.out.printf("The corresponding number is 6");break;
            case 'p', 'q', 'r', 's': System.out.printf("The corresponding number is 7");break;
            case 't', 'u', 'v': System.out.printf("The corresponding number is 8");break;
            case 'w', 'x', 'y', 'z': System.out.printf("The corresponding number is 9");break;
            default:System.out.printf("%c is a Invalid input", num.charAt(0));break;
        }
    }

    public static void C4_16()
    {
        int index = 65 + (int)(Math.random() * 26);// page109 in 12th edition
        System.out.printf("%c", (char)index);
    }

    public static void C4_17()
    {
        //pass
    }


    public static void C4_18()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters:");
        String num = input.next();
        if (num.charAt(0) == 'M' || num.charAt(0) == 'C' || num.charAt(0) == 'I')
        {
            switch (num.charAt(0))
            {
                case 'M':System.out.print("Mathematics ");break;
                case 'C':System.out.print("CS ");break;
                case 'I':System.out.print("IT ");break;
            }
            switch (num.charAt(1))
            {
                case '1':System.out.print("Freshman ");break;
                case '2':System.out.print("Sophomore ");break;
                case '3':System.out.print("Junior ");break;
                case '4':System.out.print("Senior ");break;
                default:System.out.printf("%s is a Invalid input", num);break;
            }
        }
        else
        {
            System.out.printf("%s is a Invalid input", num);
        }


    }

    public static void C4_19()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the an ISBN as String");
        String isbn = input.next();
        int initial = Integer.parseInt(isbn);
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

    public static void C4_20()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a String");
        String user = input.next();
        System.out.printf("The length is %d and the first character is %c", user.length(), user.charAt(0));
    }

    public static void C4_21()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the an SSN");
        String SSN= input.next();
        if (SSN.charAt(3) != '-' || SSN.charAt(6) != '-' || SSN.length() != 11)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println(SSN + " is a SSN");
        }
    }

    public static void C4_22()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first String");
        String first = input.next();
        System.out.print("Enter the second String");
        String second = input.next();
        if (first.contains(second))
        {
            System.out.printf("%s is a substring of %s", second, first);
        }
        else
        {
            System.out.printf("%s is not a substring of %s", second, first);
        }
    }

    public static void C4_23()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week:");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate:");
        double federalRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate:");
        double stateRate = input.nextDouble();
        double grossPay = hours * payRate;
        double federalPay = grossPay * federalRate;
        double statePay = grossPay * stateRate;
        System.out.printf("Employee Name: %s\nHours Worked: %.1f\nPay Rate: $%.1f\nGross Pay: $%.1f\nDeduction: \n" +
                "\tFederal Withholding (%.1f%%): %.2f\n\tState Withholding (%.1f%%): %.2f\n\tTotal Deduction: $%.2f\nNet Pay: $%.2f"
                ,name, hours, payRate, grossPay, federalRate * 100, federalPay, stateRate * 100, statePay, (statePay + federalPay), (grossPay - statePay - federalPay));
    }

    public static void C4_24()
    {
        
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        C4_23();

    }
}
