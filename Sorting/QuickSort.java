//Write a Java program to sort an array using Quick Sort technique.

import java.util.Scanner;

public class QuickSort {

    // function to partition the array
    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // quick sort function
    static void quickSort(int arr[], int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

//Output:
Enter number of elements: 7
Enter array elements:
25 10 80 30 90 40 50

Sorted array:
10 25 30 40 50 80 90
