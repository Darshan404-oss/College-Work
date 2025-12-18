//Write a Java program to sort an array using Radix Sort technique.

import java.util.Scanner;

public class RadixSort {

    // function to get maximum value in array
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // function to do counting sort based on digit
    static void countingSort(int arr[], int n, int exp) {

        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // radix sort function
    static void radixSort(int arr[], int n) {

        int max = getMax(arr, n);

        for (int exp = 1; max / exp > 0; exp = exp * 10) {
            countingSort(arr, n, exp);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int[] arr;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        radixSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

//Output:
Enter number of elements: 6
Enter array elements:
170 45 75 90 802 24

Sorted array:
24 45 75 90 170 802

