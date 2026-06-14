import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int og = num;
        int cube = 0;
        while(num!=0){
            int digit = num % 10;
            cube =cube + (int)Math.pow(digit, 3);
            num = num /10;
        }
        System.out.println((cube == og )?"armstrong number":"not an armstrong number");
    }
}
