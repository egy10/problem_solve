package string;

import java.util.HashMap;
import java.util.Map;

public class UnqueChar {
    public static void main(String[] args) {
        String result = "Mongolia";
        System.out.println(isUniqueChar(result));
    }
    public static char isUniqueChar(String s) {
        Map<Character, Integer> visitedChar = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (visitedChar.containsKey(c)) {
                visitedChar.put(c,+1);
            } else  {
                visitedChar.put(c, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (visitedChar.get(c) == 1){
                return c;
            }
        }
        return '-';
    }
}
