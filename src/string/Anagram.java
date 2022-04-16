package string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        boolean result = areAnagrams("Hello", "olleH");
        System.out.println("Are anagram: " + result);
    }
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        // B-1 a-3 t-3

        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            if (map.containsKey(c)){
                int value = map.get(c) + 1;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }

        for(Character c : s2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c) - 1);

            if(map.get(c) == 0){
                map.remove(c);
            }
        }

        if(map.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}
