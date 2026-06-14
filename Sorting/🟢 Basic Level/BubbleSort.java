import java.util.*;
public class BubbleSort {
    //printing array
    public static void show(int[] arr){
        System.out.print("Array: ");
        System.out.println(Arrays.toString(arr));
        /* 
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        */
    }
    //Bubble Sort
    public static int[] sorting(int[] arr){
        boolean swapped;
        for(int i =0; i<arr.length; i++){
            swapped = false;
            for(int j = 0; j< arr.length - i -1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =  arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }
    //main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        //entering values
        for (int i =0; i< nums.length; i++){
            System.out.println("Enter element "+ i + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Before sorting: ");
        show(nums);
        sorting(nums);
        System.out.print("After sorting: ");
        show(nums);
    }
}
