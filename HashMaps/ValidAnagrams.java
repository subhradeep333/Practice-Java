/*
Given two strings s and t, determine if t is an anagram of s.
An anagram means both strings contain the same characters with the same frequencies, just possibly in a different order.
*/

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagrams {
    public static void checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            System.out.println("false");
            return;
        }

        HashMap<Character,Integer> freq = new HashMap<>();

        for(char ch: s1.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }

        for(char ch: s2.toCharArray()){
            if(!freq.containsKey(ch)){
                System.out.println("false");
                return;
            }

            freq.put(ch, freq.get(ch)-1);

            if(freq.get(ch)==0){
                freq.remove(ch);
            }
        }

        System.out.println(freq.isEmpty());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String 1: ");
        String s1 = sc.nextLine();
        System.out.println("String 2: ");
        String s2 = sc.nextLine();

        checkAnagram(s1,s2);

        sc.close();
    }
}
