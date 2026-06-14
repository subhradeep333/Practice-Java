/*

   A 
  B C 
 D E F 
G H I J 
*/
import java.util.*;
public class Charac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
        char c = 'A';
        for(int i = 1; i<=n; i++){
            for(int space = 1; space<=n - i; space++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=i; j++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
