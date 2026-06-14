package Sorting;

public class AllSort {
    // bubble sort
    int[] bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        return arr;
    }

    // insertion sort
    int[] insertionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        return arr;
    }

    // selection sort
    int[] selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int smallest = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (smallest > arr[j]) {
                    smallest = arr[j];
                }
            }
            int temp = smallest;
            smallest = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

class Main {
    public static void main(String[] args) {
        AllSort obj = new AllSort();
        int arr[] = { 7, 8, 3, 1, 2 };
        int sortedArr[] = obj.bubbleSort(arr, 5);
        System.out.print("Sorted array : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
        int sortedArr1[] = obj.insertionSort(arr, 5);
        System.out.print("Sorted array : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(sortedArr1[i] + " ");
        }
        System.out.println();
        int sortedArr2[] = obj.selectionSort(arr, 5);
        System.out.print("Sorted array : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(sortedArr2[i] + " ");
        }
    }
}