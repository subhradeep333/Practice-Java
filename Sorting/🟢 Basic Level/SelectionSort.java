package Sorting;

public class SelectionSort {
    int[] selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int arr[] = { 7, 8, 3, 1, 2 };
        int sortedArr[] = obj.selectionSort(arr, 5);
        System.out.print("Sorted array : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
