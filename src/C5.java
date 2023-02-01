import java.util.Scanner;

public class C5 {

    public static void C5_1()
    {
        Scanner input = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        double sum = 0.0;
        int user = input.nextInt();
        while (user != 0) {
            if (user > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            sum += user;
            user = input.nextInt();
        }
        if (countPositive + countNegative == 0) {
            System.out.println("No number are entered except 0");
        } else {
            System.out.println("The number of positives is " + countPositive);
            System.out.println("The number of negatives is " + countNegative);
            System.out.println("The total  is " + sum);
            System.out.println("The average is " + (sum / (countPositive + countNegative)));
        }
    }

    public static void C5_2()
    {
        final int MAX = 10;
        int currentCount = 0;
        int correctCount = 0;
        int answer = 0;
        long startTime = System.currentTimeMillis();
        while (currentCount < 10) {
            int number1 = 1 + (int) (Math.random() * 15);
            int number2 = 1 + (int) (Math.random() * 15);
            Scanner input = new Scanner(System.in);
            System.out.printf("Enter the answer of %d + %d = ", number1, number2);
            answer = input.nextInt();
            if (answer == number1 + number2) {
                correctCount++;
            } else {
                System.out.printf("The correct answer is: %d\n", number1 + number2);
            }
            currentCount++;
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.printf("You spend %d s and the correct is %d", testTime, correctCount);
    }

    public static void C5_3()
    {
        System.out.printf("千克\t\t磅\n");
        for (int i = 1; i < 200; i += 2)
        {
            System.out.printf("%d\t\t%.1f\n", i, i * 2.2);
        }
    }

    public static void C5_4()
    {
        System.out.printf("英里\t\t千米\n");
        for (int i = 1; i < 11; i++)
        {
            System.out.printf("%d\t\t%.3f\n", i, i * 1.609);
        }
    }

    public static void C5_5()
    {
        System.out.printf("千克\t\t\t榜\t\t\t磅\t\t\t千克\n");
        int j = 20;
        for (int i = 1; i < 200; i += 2, j += 5)
        {
            System.out.printf("%d\t\t\t%.1f\t|\t%d\t\t\t%.2f\n", i, i * 2.2, j, j / 2.2);
        }
    }

    public static void C5_6()
    {
        System.out.printf("英里\t\t\t千米\t\t\t千米\t\t\t英里\n");
        int j = 20;
        for (int i = 1; i < 11; i += 1, j += 5)
        {
            System.out.printf("%d\t\t\t%.3f\t|\t%d\t\t\t%.3f\n", i, i * 1.609, j, j / 1.609);
        }
    }

    public static void C5_7()
    {
        int fee = 10000;
        int sum = 0;
        for (int i = 0; i < 10; i++)
        {
            fee *= 1.05;
        }
        for (int i = 0; i < 4; i++)
        {
            sum += fee;
        }
        System.out.printf("The fee after 10 years is %d, and the sum of 4 years fee is %d", fee, sum);
    }

    public static void C5_8()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of student:");
        int num = input.nextInt();
        String maxName = "";
        double maxScore = 0.0;
        for (int i = 1; i <= num; i++)
        {
            System.out.printf("Enter the name of student%d:", i);
            String name = input.next();
            System.out.printf("Enter the score of student%d:", i);
            double score = input.nextDouble();
            if (score >= maxScore) {
                maxName = name;
                maxScore = score;
            }
        }
        System.out.printf("The best student is %s and his/her score is %f", maxName, maxScore);
    }

    public static void C5_9()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of student:");
        int num = input.nextInt();
        String maxName = "";
        String nextName = "";
        double maxScore = 0.0;
        double nextScore = 0.0;
        for (int i = 1; i <= num; i++)
        {
            System.out.printf("Enter the name of student%d:", i);
            String name = input.next();
            System.out.printf("Enter the score of student%d:", i);
            double score = input.nextDouble();
            if (score >= maxScore)
            {
                nextScore = maxScore;
                nextName = maxName;
                maxName = name;
                maxScore = score;
            }
            else if (score < maxScore && score >= nextScore)
            {
                nextName = name;
                nextScore = score;
            }
        }
        System.out.printf("The best two students are %s, %s and their score is %.2f, %.2f", maxName, nextName, maxScore, nextScore);
    }

    public static void C5_10()
    {
        int count = 0;
        for (int i = 100; i <= 1000; i += 5)// faster than i++
        {
            if (i % 6 == 0 && i % 5 == 0)
            {
                System.out.printf("%d ", i);
                count++;
                if (count == 10)
                {
                    System.out.printf("\n");
                    count = 0;
                }
            }
        }
    }

    public static void C5_11()
    {
        int count = 0;
        for (int i = 100; i <= 200; i += 1)
        {
            if (i % 6 == 0 && i % 5 == 0)
            {
                continue;
            }
            else if (i % 6 == 0 || i % 5 == 0)
            {
                System.out.printf("%d ", i);
                count++;
                if (count == 10)
                {
                    System.out.printf("\n");
                    count = 0;
                }
            }
        }
    }

    public static void C5_12()
    {
        int n = 0;
        while (Math.pow(n, 2) < 12000)
        {
            n++;
        }
        System.out.printf("The number is %d", n);
    }

    public static void C5_13()
    {
        int n = 0;
        while (Math.pow(n, 3) < 12000)
        {
            n++;
        }
        System.out.printf("The number is %d", --n);
    }

    public static void C5_14()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter two number: ");
        int number1 = input.nextInt(), number2 = input.nextInt();
        int min = number1 > number2 ? number2: number1;
        while (min >= 1)
        {
            if (number1 % min == 0 && number2 % min == 0)
            {
                System.out.printf("The gcd is %d", min);
                break;
            }
            min--;
        }
    }

    public static void C5_15()
    {
        int count = 0;
        for (int i = 33; i <= 126; i += 1)
        {
            if (Character.isDigit(i))
            {
                System.out.print((char)i + " ");
            }
            else
            {
                System.out.print((char)i);
            }
            count++;
            if (count == 10)
            {
                System.out.printf("\n");
                count = 0;
            }
        }
    }

    public static void C5_16()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an int:");
        int number = input.nextInt();
        int i = 2;
        while (number != 1)
        {
            if (number % i == 0)
            {
                number /= i;
                System.out.printf("%d, ", i);
            }
            else
            {
                i++;
            }
        }
    }

    public static void C5_17()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int:");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++)
        {
            for (int j = (num - i)*2; j >= 0; j -= 1)
            {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--)
            {
                System.out.print(k);
                System.out.print(" ");
            }
            for (int k2 = 2; k2 <= i; k2++)
            {
                System.out.print(k2);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void C5_18()
    {
        int num = 6;
        System.out.print("Type A\n");
        for (int a = 1; a <= num; a++)
        {
            for (int a1 = 1; a1 <= a; a1++)
            {
                System.out.print(a1);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("Type B\n");
        for (int a = num; a >= 1; a--)
        {
            for (int a1 = 1; a1 <= a; a1++)
            {
                System.out.print(a1);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("Type C\n");
        for (int a = num; a >= 1; a--)
        {
            for (int j = 1; j < a*2 - 1; j += 1)
            {
                System.out.print(" ");
            }
            for (int a1 = 1+ num - a; a1 >= 1; a1--)
            {
                System.out.print(a1);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.print("Type D\n");
        for (int a = num; a >= 1; a--)
        {
            for (int j = (num - a)*2 - 1; j >= 0; j -= 1)
            {
                System.out.print(" ");
            }
            for (int a1 = 1; a1 <= a; a1++)
            {
                System.out.print(a1);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void C5_19()
    {
        int num = 7;
        for (int i = 0; i <= num; i++)
        {
            for (int j = (num - i)*2; j >= 0; j -= 1)
            {
                System.out.print("  ");
            }
            for (int k2 = 0; k2 < i; k2++)
            {
                System.out.printf("%4d", (int)Math.pow(2, k2));
            }
            for (int k = i; k >= 0; k--)
            {
                System.out.printf("%4d", (int)Math.pow(2, k));
            }
            System.out.print("\n");
        }
    }

    public static void C5_20()
    {
        int count = 0;
        for (int i = 2; i <= 1000; i++)
        {
            boolean isPrime = true;
            for (int division = 2; division <= (i / 2); division++)
            {
                if (i % division == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.printf("%d ", i);
                count++;
                if (count == 8)
                {
                    System.out.printf("\n");
                    count = 0;
                }
            }
        }
    }

    public static void C5_21()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount:");
        int loanAmount = input.nextInt();
        System.out.print("Number of Years:");
        int year = input.nextInt();
        System.out.printf("Interest Rate\tMonthly Payment\tTotal Payment\n");
        for (int i = 0; i <=24; i++)
        {
            double rate = 5.0+0.125*i;
            double monthRate = rate / 1200;
            double monthPayment = loanAmount * monthRate / (1 - 1 / Math.pow(1 + monthRate, year * 12));
            double yearPayment = monthPayment * year * 12;
            System.out.printf("%-13.3f\t%-13.2f\t%-13.2f\n",rate , monthPayment, yearPayment);
        }
    }

    public static void C5_22()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount:");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years:");
        int year = input.nextInt();
        System.out.print("Rate of Years:");
        double rateOfYear = input.nextDouble();

        double monthRate = rateOfYear / 1200;
        double monthPayment = loanAmount * monthRate / (1 - 1 / Math.pow(1 + monthRate, year * 12));
        double yearPayment = monthPayment * year * 12;
        System.out.printf("\nMonthly Payment: %6.2f\nTotal Payment: %6.2f\n\n", monthPayment, yearPayment);

        System.out.printf("Payment#\tInterest\tPrincipal\tBalance\n");
        for (int i = 1; i <= year * 12; i++)
        {
            double paymentInterest = monthRate * loanAmount;
            double paymentPrincipal = monthPayment - paymentInterest;
            loanAmount = loanAmount - paymentPrincipal;
            System.out.printf("%-7d\t\t%-13.2f%-15.2f%-14.2f\n", i, paymentInterest, paymentPrincipal, loanAmount);
        }

    }

    public static void C5_23()
    {
        double result0 = 0;
        double result1 = 0;
        for (double i = 1; i <= 1000; i++)
        {
            result0 += 1 / i;
        }
        for (double i = 1000; i >= 1; i--)
        {
            result1 += 1 / i;
        }
        System.out.println(result0);
        System.out.println(result1);
    }

    public static void C5_24()
    {
        double result = 0;
        for (double i = 1; i <= 97; i += 2)
        {
            result += i / (i + 2);
        }
        System.out.print(result);
    }

    public static void C5_25()
    {
        double pi = 0;
        for (int a = 10000; a <= 100000; a += 10000)
        {
            for (double i = 1; i <= a; i++)
            {
                pi += 4 * Math.pow(-1, (i + 1)) / (2 * i - 1);
            }
            System.out.println("When i = " + a + ", Pi is " + pi);
            pi = 0;
        }
    }

    public static void C5_26()
    {
        double e = 1;
        int item = 1;
        for (double i = 1; i <= 20; i++)
        {
            item *= i;
            e += 1.0/item;
            System.out.println("When i = " + i + " e = " + e);
        }
    }

    public static void C5_27()
    {
        int count = 0;
        for (int i = 101; i <= 2100; i++)
        {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
            {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0)
                {
                    System.out.println();
                }
            }
        }
        System.out.println("\nThe number is " + count);
    }

    public static void C5_28_29()
    {
        //pass
    }

    public static void C5_30()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Year Rate: ");
        double rate = input.nextDouble();
        System.out.print("Month: ");
        double month = input.nextDouble();

        double monthRate = rate / 1200;
        double currentAmount = 0;
        for (int i = 1; i <= month; i++)
        {
            currentAmount = (loanAmount + currentAmount) * (1 + monthRate);
        }
        System.out.println("The result is " + currentAmount);
    }

    public static void C5_31()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double rate = input.nextDouble();
        System.out.print("Enter maturity period: ");
        double month = input.nextDouble();
        System.out.println("Month\tCD Value");

        double monthRate = rate / 1200;
        for (int i = 1; i <= month; i++)
        {
            loanAmount = loanAmount * (1 + monthRate);
            System.out.printf("%d\t\t%8.2f\n", i, loanAmount);
        }
    }

    public static void C5_32()
    {
        //pass
    }

    public static void C5_33()
    {
        for (double i = 1; i <= 10000; i++)
        {
            double item = 0;
            for (double b = 1; b <= i / 2; b++)
            {
                if (i % b == 0) {
                    item += b;
                }
            }
            if (item == i)
            {
                System.out.println(i);
            }
        }
    }

    public static void C5_34()
    {
        Scanner input = new Scanner(System.in);
        int countForUser = 0;
        int countForCpu = 0;
        while (true)
        {
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
                    countForUser++;
                }
                else if (computer == 2)
                {
                    System.out.print("The computer is paper and you is rock, you lose!");
                    countForCpu++;
                }
            }
            else if (user == 1)
            {
                if (computer == 0)
                {
                    System.out.print("The computer is rock and you is scissor, you lose!");
                    countForCpu++;
                }
                else if (computer == 1)
                {
                    System.out.print("The computer is scissor and you is scissor, it's a draw!");
                }
                else if (computer == 2)
                {
                    System.out.print("The computer is paper and you is scissor, you won!");
                    countForUser++;
                }
            }
            else if (user == 2)
            {
                if (computer == 0)
                {
                    System.out.print("The computer is rock and you is paper, you won!");
                    countForUser++;
                }
                else if (computer == 1)
                {
                    System.out.print("The computer is scissor and you is paper, you lose!");
                    countForCpu++;
                }
                else if (computer == 2)
                {
                    System.out.print("The computer is paper and you is paper, it's a draw!");
                }
            }
            System.out.println("\nThe user won " + countForUser + " and " + "The cpu won " + countForCpu);
            if (countForUser == 2 || countForCpu ==2)
            {
                break;
            }
            System.out.println("\nGame Over");
        }
    }

    public static void C5_35()
    {
        double result = 0;
        for (int i = 1; i <= 624; i++)
        {
            result += 1 / (Math.pow(i, 0.5) + Math.pow(i+1, 0.5));
        }
        System.out.println("The result is: " + result);
    }

    public static void C5_36()
    {
        //pass
    }

    public static void C5_37()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int user = input.nextInt();
        String bNumber = "";
        for (int i = user; i >= 1; i /= 2)
        {
            bNumber = i%2 + bNumber;
        }
        System.out.print(bNumber);
    }

    public static void C5_38()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int user = input.nextInt();
        String oNumber = "";
        for (int i = user; i >= 1; i /= 8)
        {
            oNumber = i%8 + oNumber;
        }
        System.out.print(oNumber);
    }

    public static void C5_39_40()
    {
        //pass
    }

    public static void C5_41()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number, ends with 0:");
        int user;

        int max = 0;
        int count = 0;
        do
        {
            user = input.nextInt();
            if (max < user)
            {
                max = user;
                count = 1;
            }
            else if (max == user)
            {
                count++;
            }
        }while (user != 0);
        if ( count == 0)
        {
            System.out.print("No numbers are entered except 0");
        }
        else
        {
            System.out.print("The max number is: " + max + " and " + "the count is " + count);
        }
    }

    public static void C5_42()
    {
        //pass
    }

    public static void C5_43()
    {
        int count = 0;
        for (int a = 1; a <= 7; a++)
        {
            for (int b = a+1; b <= 7; b++)
            {
                System.out.println(a + "\t" + b);
                count++;
            }
        }
        System.out.print("The count is " + count);
    }

    public static void C5_44()
    {
        Scanner input = new Scanner(System.in);
        short user = input.nextShort();
        for (int i = 15; i >= 0; i--)
        {
            int temp = user >> i;
            System.out.print(temp & 1);
        }
    }

    public static void C5_45()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        double user, sum = 0, sum2 = 0;

        double count = 0;
        do
        {
            user = input.nextDouble();
            sum += user;
            sum2 += user * user;
            count++;
        }while (count != 10);
        double average = sum / count;
        double standardDeviation = Math.pow(((sum2 - sum * sum / count) / (count - 1)), 0.5);
        System.out.printf("The mean is %4.2f\nThe standard deviation is %7.5f", average, standardDeviation);
    }

    public static void C5_46()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an String: ");
        String user = input.next();
        int length = user.length() - 1;
        System.out.print("The reversed string is ");
        for (int i = length; i >= 0; i--)
        {
            System.out.print(user.charAt(i));
        }
    }

    public static void C5_47()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an 12 ISBN: ");
        String user = input.next();
        int length = user.length() - 1;
        int result = 0;

        if (length != 11)
        {
            System.out.print(user + " is an invalid input");
        }
        else
        {
            for (int i = 0; i <= length; i++)
            {
                if (i % 2 == 0) //i = 0 means d1
                {
                    result += 3 * (user.charAt(i)-48);
                }
                else
                {
                    result += (user.charAt(i)-48);
                }
            }
            result = (10 - (result) % 10 == 10) ? 0 : (10 - (result) % 10);
            System.out.print(user + result);
        }
    }

    public static void C5_48()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        int length = user.length() - 1;
        for (int i = 0; i <= length; i += 2)
        {
            System.out.print(user.charAt(i));
        }
    }

    public static void C5_49()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine().toLowerCase();
        int length = user.length() - 1;
        int count = 0;
        int countForblank = 0;

        for (int i = 0; i <= length; i++)
        {
            switch (user.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':count++;break;
                case ' ':countForblank++;break;
            }
       }
        System.out.printf("The number of vowels is %d\nThe number of consonants is %d", count, length - count - countForblank + 1);

    }

    public static void C5_50()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = input.nextLine();
        int length = user.length() - 1;
        int countFOrUpper = 0;

        for (int i = 0; i <= length; i++)
        {
            if (Character.isUpperCase(user.charAt(i)))
            {
                countFOrUpper++;
            }
        }
        System.out.printf("The number of uppercase letters is: %d", countFOrUpper);
    }

    public static void C5_51()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();
        int length = (first.length() > second.length()) ? first.length() : second.length();
        String common = "";

        for (int i = 0; i <= length-1; i++)
        {
            if (first.charAt(i) == second.charAt(i))
            {
                common += first.charAt(i);
            }
            else
            {
                break;
            }
        }
        if (common == "")
        {
            System.out.printf("%s and %s have no common prefix", first, second);
        }
        else
        {
            System.out.printf("The common prefix is %s", common);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        C5_51();
    }
}
