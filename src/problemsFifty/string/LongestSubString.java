package problemsFifty.string;

import java.util.HashMap;
import java.util.Map;

//using sliding window
public class LongestSubString {
    public static void main(String[] args) {
        String result = "abvcnvbvn";
        int k = 2;
        System.out.println(longestSubStrWithKDistinctCharacter(result, k));

    }
    public static int longestSubStrWithKDistinctCharacter(String str, int k) {
        if (str == null || str.length() == 0 || k <= 0 || k > str.length()) {
            return -1;
        }
        int maxLength = 0;
        int start, end;
        start = end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < str.length()) {
            char currentChar = str.charAt(end);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            while (map.size() > k) {
                char charFromFront = str.charAt(start);
                map.put(charFromFront, map.get(charFromFront) - 1);

                if (map.get(charFromFront) == 0) {
                    map.remove(charFromFront);
                }
                start ++;
            }
            maxLength = Math.max(end - start + 1, maxLength);
            end ++;
        }
        return maxLength;
    }
}
