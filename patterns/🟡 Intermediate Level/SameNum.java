/*

1
12
123
1234

*/

import java.util.Scanner;

public class SameNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
    
        for(int i =1; i<=n; i++){
            int num = 1;
            for(int j =1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
