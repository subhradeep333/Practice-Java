import java.util.*;

class basic{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        // we are initializing the StringBuilder with an initial string value.
        // So the object sb already contains "tony".
        // It is similar to:
        // String sb = "tony";
        System.out.println(sb.charAt(2));
        // this means T -> 0
        //            o -> 1
        //            n -> 2
        //            y -> 3
        sb.setCharAt(0,'n');
        System.out.println(sb);
        // it will change the 0th index and set the character to 'n'
        sb.insert(0, 'T');
        System.out.println(sb);
        // so this will add the charater in the 0th index without replacing the elements in its place
        System.out.println(sb.length());
        System.out.println(sb.deleteCharAt(1));
        // this deletes the character at index 1
        System.out.println(sb.append(" Stark"));
        System.out.println(sb.reverse());
    }
}