package string;

import java.util.HashMap;
import java.util.Map;

public class Anagram2 {
    public static void main(String[] args) {
        boolean result = isAnagram("Helllo", "elloH");
        System.out.println("Are anagram: " + result);
    }
    //E,n,k,h
    //Enkhe
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character, Integer> firstString = new HashMap<>();
        Map<Character, Integer> secondString = new HashMap<>();
        for (char first : s1.toCharArray()) {
            if (firstString.containsKey(first)) {
                firstString.put(first, +1);
            } else{
                firstString.put(first, 1);
            }
        }
        for (char second : s2.toCharArray()) {
            if (secondString.containsKey(second)){
                secondString.put(second, +1);
            }else {
                secondString.put(second, 1);
            }
        }
        if (firstString.equals(secondString)){
            return true;
        } else {
            return false;
        }
    }

}
