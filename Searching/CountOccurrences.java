//Write a Java program to count the number of occurrences of an element in a sorted array using Binary Search.

import java.util.Scanner;

public class CountOccurrences {

    // function to find first occurrence
    static int firstOccurrence(int arr[], int n, int key) {
        int low = 0, high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;   // move left
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
                low = mid + 1;   // move right
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

        System.out.print("Enter element to count: ");
        key = sc.nextInt();

        int first = firstOccurrence(arr, n, key);
        int last = lastOccurrence(arr, n, key);

        if (first == -1) {
            System.out.println("Element not found");
        } else {
            int count = last - first + 1;
            System.out.println("Number of occurrences: " + count);
        }

        sc.close();
    }
}

//Output:
Enter number of elements: 7
Enter elements in sorted order:
10 20 20 20 30 40 50
Enter element to count: 20

Number of occurrences: 3

