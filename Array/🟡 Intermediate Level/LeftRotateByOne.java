import java.util.Scanner;
public class LeftRotateByOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Initial array: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
        int temp = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.print("\nAfter left rotation by one: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}