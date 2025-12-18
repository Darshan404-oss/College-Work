//Write a Java program to find the first and last occurrence of an element in a sorted array using Binary Search.

import java.util.Scanner;

public class FirstLastOccurrence {

    // function to find first occurrence
    static int firstOccurrence(int arr[], int n, int key) {
        int low = 0, high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;   // search in left side
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // function to find last occurrence
    static int lastOccurrence(int arr[], int n, int key) {
        int low = 0, high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                result = mid;
                low = mid + 1;   // search in right side
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

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

        int first = firstOccurrence(arr, n, key);
        int last = lastOccurrence(arr, n, key);

        if (first == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First occurrence at position: " + (first + 1));
            System.out.println("Last occurrence at position: " + (last + 1));
        }

        sc.close();
    }
}

//Output:
Enter number of elements: 8
Enter elements in sorted order:
5 10 10 10 20 30 40 50
Enter element to search: 10

First occurrence at position: 2
Last occurrence at position: 4

