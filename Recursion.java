import java.util.Scanner;
import java.math.BigInteger;

public class Recursion {

    //Factorial method using recursion
    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE; // Base case
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1)); // Recursive case
        }
    }

    //Number of digits in a number using recursion
    public static int countDigits(int n) {
        if (n == 0) {
            return 0; // Base case
        } else {
            return 1 + countDigits(n / 10); // Recursive case
        }
    }
    

    //Printing  till number n using recursion
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1); // Recursive case
            System.out.print(n + " "); // Print after the recursive call to print in ascending order
        }
    }


    // Printing number in reverse
    public static void printNumbersReverse(int n) {
        if (n > 0) {
            System.out.print(n + " "); // Print before the recursive call to print in descending order
            printNumbersReverse(n - 1); // Recursive case
        }
    }


    // Print x^n using recursion (Stack Height = 1)
    public static int xPowNStack1(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative.");
        }

        if (n == 0) {
            return 1; // Base case
        }

        if (x == 0) {
            return 0; // Base case
        }

        return x * xPowNStack1(x, n - 1);
    }


    // Print x^n using recursion (Stack Height = log n)
    public static int xPowNStackLogN(int x, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative.");
        }

        if (n == 0) {
            return 1; // Base case
        }

        if (x == 0) {
            return 0; // Base case
        }

        int halfPower = xPowNStackLogN(x, n / 2);

        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * x;
        }
    }


    // Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n <= 0) {
            return;
        }

        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }


    //Find the element first and last index
    public static int first = -1;
    public static int last = -1;
    public static void elementIndex(String str, int idx, char element) {
        if(idx == str.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }

        char currChar = str.charAt(idx);

        if(currChar == element) {
            if(first == -1) {
                first = idx;
            }
            last = idx;
        }

        elementIndex(str, idx + 1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Recursion Practice Program =====");

        System.out.println("\n1. Factorial of a Number");
        System.out.print("Enter a non-negative number: ");
        int a = sc.nextInt();

        //Factorial of a number
        System.out.println("Factorial of " + a + " is: " + factorial(a));

        //Count Digits
        System.out.println("\n2. Count Digits");
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.println("Number of digits in " + b + " is: " + countDigits(b));

        //Print Number in ascending order
        System.out.println("\n3. Print Numbers from 1 to n");
        System.out.print("Enter n: ");
        int c = sc.nextInt();
        System.out.print("Numbers from 1 to " + c + ": ");
        printNumbers(c);

        //Print Number in decending order
        System.out.println("\n\n4. Print Numbers from n to 1");
        System.out.print("Enter n: ");
        int d = sc.nextInt();
        System.out.print("Numbers from " + d + " to 1: ");
        printNumbersReverse(d);

        //Print x^n; Stack Height = 1
        System.out.println("\n\n5. Calculate x^n using recursion");
        System.out.print("Base x: ");
        int x = sc.nextInt();
        System.out.print("Exponent n: ");
        int exponent = sc.nextInt();
        System.out.println(x + " raised to the power " + exponent + " is: " + xPowNStack1(x, exponent));
        System.out.println("Using log n recursion: " + xPowNStackLogN(x, exponent));

        //Tower of Hanoi
        System.out.println("\n6. Tower of Hanoi");
        System.out.print("Enter the number of disks: ");
        int disk = sc.nextInt();
        System.out.println("Steps to move " + disk + " disk(s) from S to D using H:");
        towerOfHanoi(disk, "S", "H","D");

        //Find the element first and last accurance
        System.out.println("\n7. Find First and Last Occurrence of a Character");
        System.out.print("String: ");
        String str = sc.next();
        System.out.print("Character to search: ");
        char element = sc.next().charAt(0);
        elementIndex(str, 0, element);

        System.out.println("\n===== Program Finished =====");
    }
}
