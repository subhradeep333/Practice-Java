/*

    *
   * *
  *   *
 *     *
*********

*/

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
    
        for(int i =1; i<=n ; i++){
            for(int space = 1; space<= n-i; space++){
                System.out.print(" ");
            }
            for(int j =1; j<=2*i -1; j++){
                if(i==1 || i==n || j==1 || j==2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
