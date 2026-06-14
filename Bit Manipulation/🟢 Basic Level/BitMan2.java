public class BitMan2 {
    public static void main(String args[]){
        // Set bit
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        int newNum = bitMask | n;
        System.out.println(newNum);
    }
}
