package string;

import java.util.HashMap;
import java.util.Map;

public class UnqueChar {
    public static void main(String[] args) {

    }
    public static boolean isUniqueChar(String s) {
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
            if (visitedChar.get(i) == 1){
                return true;
            }
        }
        return false;

    }
}
