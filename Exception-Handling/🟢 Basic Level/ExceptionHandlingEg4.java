// Accept an array of 5 integers and handle ArrayIndexOutOfBoundsException when accessing the 10th element.
import java.util.Scanner;
public class ExceptionHandlingEg4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array elements : ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index number to access the element");
        int n = sc.nextInt();
        sc.close();
        try {
            if(n<5){
                System.out.println(arr[n]);
            }
            throw new Exception("ArrayOutOfBound");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
