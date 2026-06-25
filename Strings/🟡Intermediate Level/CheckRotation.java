import java.util.Scanner;

public class CheckRotation {

    public static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if (isRotation(str1, str2)) {
            System.out.println("Strings are Rotations of Each Other");
        } else {
            System.out.println("Strings are Not Rotations of Each Other");
        }

        sc.close();
    }
}