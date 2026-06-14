import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i =2; i<= (int)num/2; i++){
            if(num % i ==0){
                isPrime = false;
                break;
            }
        }
        System.out.println((isPrime) ? "prime number" : "not a prime number");
    }
}
