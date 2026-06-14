import java.util.Scanner;
public class ExceptionHandlingEg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.close();
        try {
            if (age < 18)
                throw new Exception("Not eligible to vote");
            else
                System.out.println("Eligible to vote");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
