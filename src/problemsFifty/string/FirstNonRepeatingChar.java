package problemsFifty.string;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.util.HashMap;
import java.util.Map;

// returns index of the string's first non-repeating character
// input: "abcdcaf"
//output: "b" or retuns idx = 1;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String result = "masdabcdcaf";
        System.out.println(firstNonRepeatingChar(result));
    }
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (map.get(tmp) == 1){
                return tmp;
            }
        }
        return '-';
    }
}
