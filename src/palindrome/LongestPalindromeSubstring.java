package palindrome;
//Medium
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String result = "dhfh";
        System.out.println(longestPalindromeSubstring(result));
    }
    //??
    public static String longestPalindromeSubstring(String str) {
        String longest = "" ;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String substring = str.substring(i, j + 1); //inclusive
                if (substring.length() > longest.length() && isPalindrome(substring)) {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    public static boolean isPalindrome(String str) {
        int leftIdx = 0;
        int rightIdx = str.length() - 1;
        while (leftIdx < rightIdx) {
            if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
                return false;
            }
            leftIdx ++;
            rightIdx --;

        }
        return true;
    }
}
