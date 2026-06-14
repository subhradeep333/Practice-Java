import java.util.Scanner;

public class BitMan4 {
    public static void main(String[] args) {
        // update bit
        Scanner sc = new Scanner(System.in);
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        System.out.println("Enter a choice: ");
        System.out.println("1. Set bit");
        System.out.println("2. Clear bit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int newNum = bitMask | n;
                System.out.println(newNum);
                break;
            case 2:
                int newBitMask = (~bitMask) & n;
                System.out.println(newBitMask);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
