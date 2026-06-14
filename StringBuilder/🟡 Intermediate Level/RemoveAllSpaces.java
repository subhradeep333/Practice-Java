//Remove all spaces from a String
import java.util.*;
public class RemoveAllSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String sentence = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< sentence.length(); i++){
            if(sentence.charAt(i) != ' '){
                sb.append(sentence.charAt(i));
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
