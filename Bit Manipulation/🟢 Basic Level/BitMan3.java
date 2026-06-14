public class BitMan3 {
    public static void main(String args[]){
        // clear bit
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1 << pos;
        int newNum = (~bitMask) & n;
        System.out.println(newNum);
    }
}
