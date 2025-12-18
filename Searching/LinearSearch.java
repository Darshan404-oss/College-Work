//Write a Java program to implement Linear Search to find an element in an array.

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, key;
        int[] arr;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

//Output:
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, key;
        int[] arr;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

//Output:
Enter number of elements: 5
Enter array elements:
12 45 23 67 34
Enter element to search: 23

Element found at position: 3

