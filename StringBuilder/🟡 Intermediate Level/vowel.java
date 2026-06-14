import java.util.*;

class vowel{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("tony");
        StringBuilder temp = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        for (int i = 0;i < sb.length();i++){
            char vol = sb.charAt(i);
            if (vol != 'a' && vol != 'e' && vol != 'i' && vol != 'o' && vol != 'u'){
                temp.append(vol);
            }
            if (vol == 'a' || vol == 'e' || vol == 'i' || vol == 'o' || vol == 'u'){
                temp2.append(vol);
            }
        }
        System.out.println(temp);
        System.out.println(temp2);
    }
}