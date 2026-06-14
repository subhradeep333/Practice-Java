import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        int a, b, c;
        a =0;
        b= 1;
        System.out.println(a);
        System.out.println(b);
        for(int i =2; i<=n ;i ++){
            c = a + b;
            System.out.println(c);
            a = b;
            b =c;
        }
    }
}
