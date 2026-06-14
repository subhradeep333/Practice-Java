import java.util.*;

class Pascaltriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int number = 1;
            for (int j = 0; j <= i; j++){
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}