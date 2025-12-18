//Write a Java program to sort an array using Merge Sort technique.

import java.util.Scanner;

public class MergeSort {

    // function to merge two sub arrays
    static void merge(int arr[], int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // merge sort function
    static void mergeSort(int arr[], int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
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

        mergeSort(arr, 0, n - 1);

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
38 27 43 3 9 82

Sorted array:
3 9 27 38 43 82

