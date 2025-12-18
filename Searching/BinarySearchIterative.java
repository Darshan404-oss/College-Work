//Write a Java program to implement Binary Search using Iterative method.

import java.util.Scanner;

public class BinarySearchIterative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, key;
        int[] arr;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int mid;
        int flag = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                flag = 1;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

//output:
Enter number of elements: 5
Enter elements in sorted order:
10 20 30 40 50
Enter element to search: 30
  
Element found at position: 3

