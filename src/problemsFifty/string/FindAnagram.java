package problemsFifty.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagram {
    public static void main(String[] args) {
        String result = "bcdcbabcbd";
        String target = "abc";
        System.out.println(getAllAnagrams(result, target));

    }
    public static List<Integer> getAllAnagrams(String str, String target) {
        if (str == null || str.length() == 0 || target == null || target.length() == 0){
            return new ArrayList<>();
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            map.put(target.charAt(i), map.getOrDefault(target.charAt(i), 0) + 1);
        }
        int matchedElement = 0;
        int start = 0;
        List<Integer> anagramStartingIndex = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) -1);

                if (map.get(currentChar) == 0) {
                    matchedElement++;
                }
            }
            if (matchedElement == map.size()) {
                anagramStartingIndex.add(start);
            }
            if (i >= target.length() -1) {
                char charAtStar = str.charAt(start++);

                if (map.containsKey(charAtStar)) {
                    if (map.get(charAtStar) == 0) {
                        matchedElement --;
                    }
                    map.put(charAtStar, map.get(charAtStar) + 1);
                }
            }
        }
        return anagramStartingIndex;
    }
}
