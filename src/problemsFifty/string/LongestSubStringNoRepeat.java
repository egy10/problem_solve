package problemsFifty.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringNoRepeat {
    public static void main(String[] args) {
        String str = "babccbacd";
        //oytput : bacd there is no repeating char
        System.out.println(longestSubStringWithNoRepeat(str));
        System.out.println(lengthOfLongestSubstring(str));

    }
    public static int longestSubStringWithNoRepeat(String str){
        if (str.length() == 0 || str == null){
            return -1;
        }
        int maxLength = 0;
        int end, start;
        end = start = 0;

        Map<Character, Integer> map = new HashMap<>();
        while (end < str.length()) {
            char currentChar = str.charAt(end);

            if (map.containsKey(currentChar)) {
                start = Math.max(start, map.get(currentChar) + 1);
            }

            map.put(currentChar, end);
            maxLength = Math.max(end - start + 1, maxLength);
            end ++;
        }
        return maxLength;
    }
    // using set
    // Tc = O(2N) = O(N)
    public static int lengthOfLongestSubstring(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (i < str.length()) {
            char c = str.charAt(i);
            while (set.contains(c)) {
                set.remove(str.charAt(j));
                ++j;
            }
            set.add(c);
            max = Math.max(max, i - j + 1); //we need to determine if that length is greater than our max.
            ++i;
        }
        return max;
    }

}
// using sliding window (i, j) it's zero based so +1
// window length : (i - j + 1)
//  length    =  : (0 - 0 + 1) = 1 so on
