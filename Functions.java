import java.util.Scanner;

public class Functions {
    public static void printMyName(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java Programming.");
    }

    public static int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    

    //Enter 3 numbers from the user & make a function to print their average.
    public static int averageOfNumbers(int a, int b , int c) {
        double average = (a + b + c) / 3.0;
        return (int) average;
    }

    //Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i %2 != 0) {
                sum +=i;
            }
        }
        return sum;
    }

    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greatestOfTwoNumbers(int a, int b) {
        return (a > b )? a : b;
    }

    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static int circumferenceOfCicle(int radius) {
        return (int) (2 * Math.PI * radius);
    }

    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void isEligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
    public static int countPositiveNegativeZeros(int[] numbers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        return positiveCount + negativeCount + zeroCount; // Return total count
    }

    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static int power(int x, int n) {
        return (int) Math.pow(x, n);
    }

    //Write a program to print Fibonacci series of n terms where n is input by user :
    //0, 1, 1, 2, 3, 5, 8, 13, 21 ..... 
    //In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    public static int[] fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(
                "Number of terms must be positive."
            );
        } else if (n == 1) {
            return new int[]{0};
        } else if (n == 2) {
            return new int[]{0, 1};
        }

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

     return fib;
    }

    //Write a function that calculates the Greatest Common Divisor of 2 numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printMyName(name);

        // Sum and Product of two numbers
        System.out.print("Enter two numbers to calculate their sum and product: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + sumOfNumbers(a, b));
        System.out.println("Product: " + multiplyNumbers(a, b));
        
        // Factorial of a number
        System.out.println("Enter the number to find the factorial of: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num));

        // Average of three numbers
        System.out.print("Enter three numbers to calculate their average: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Average: " + averageOfNumbers(x, y, z));

        // Sum of odd numbers up to n
        System.out.print("Enter a number to calculate the sum of odd numbers up to that number: ");
        int n = sc.nextInt();
        System.out.println("Sum of odd numbers up to " + n + " is: " + sumOfOddNumbers(n));

        // Greatest of two numbers
        System.out.print("Enter two numbers to find the greatest: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Greatest of " + p + " and " + q + " is: " + greatestOfTwoNumbers(p, q));

        // Circumference of a circle
        System.out.print("Enter the radius of the circle to calculate its circumference: ");
        int radius = sc.nextInt();
        System.out.println("Circumference of the circle with radius " + radius + " is: " + circumferenceOfCicle(radius));

        // Eligibility to vote
        System.out.print("Enter your age to check if you are eligible to vote: ");
        int age = sc.nextInt();
        isEligibleToVote(age);

        // Count of positive, negative and zeros
        System.out.print("Enter the number of integers you want to input: ");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();  
        }
        countPositiveNegativeZeros(numbers);

        // Power of a number
        System.out.print("Enter a base number and an exponent to calculate the power: ");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));

        // Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = sc.nextInt();
        int[] fibSeries = fibonacci(terms);
        System.out.print("Fibonacci series of " + terms + " terms: ");
        for (int i = 0; i < fibSeries.length; i++) {
            System.out.print(fibSeries[i] + " ");
        } 

        // GCD of two numbers
        System.out.print("\nEnter two numbers to calculate their GCD: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
