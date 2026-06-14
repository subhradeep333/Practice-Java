package Sorting;

public class InsertionSort {
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

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int arr[] = { 7, 8, 3, 1, 2 };
        int sortedArr[] = obj.insertionSort(arr, 5);
        System.out.println(sortedArr);
    }
}
