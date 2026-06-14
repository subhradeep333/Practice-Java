/*
HALF PYRAMID

* * * * 
 * * * 
  * * 
   * 

*/

import java.util.Scanner;

public class RevPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
    
        for(int i = n; i>=1; i--){
            for(int space=1 ; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
