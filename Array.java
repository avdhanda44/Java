import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take Physics, Chemistry, and Mathematics marks as input from the user, store them in an array, and print all three marks.

        int[] marks = new int[3];

        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter Mathematics marks: ");
        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //Take an array as input from the user. Search for a given number x in that array. If x is found, return the index at which it is found. 
        // Otherwise, return -1.

        System.out.print("Enter the number of elements you want to enter: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();

        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        System.out.println("Index of " + x + " is: " + index);

        //Take an array of names as input from the user and print them on the screen.

        System.out.print("Enter the number of names you want to enter: ");
        int m = sc.nextInt();
        String[] names = new String[m];

        System.out.println("Enter the names:");
        for (int i = 0; i < m; i++) {
            names[i] = sc.next();
        }

        System.out.println("The names are:");
        for (int i = 0; i < m; i++) {
            System.out.println(names[i]);
        }

        //Find the maximum & minimum number in an array of integers. 

        System.out.print("Enter the number of elements you want to enter: ");
        int p = sc.nextInt();
        int[] arr1 = new int[p];
        System.out.println("Enter the elements:");
        for (int i = 0; i < p; i++) {
            arr1[i] = sc.nextInt();
        }
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 1; i < p; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

        // Take an array of numbers as input and check if it is an array sorted in ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        //       {3, 4, 6, 2} is not sorted in ascending order.
        System.out.print("Enter the number of elements you want to enter: ");
        int q = sc.nextInt();
        int[] arr2 = new int[q];

        System.out.println("Enter the elements:");
        for (int i = 0; i < q; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < q - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

        sc.close();
    }
}
