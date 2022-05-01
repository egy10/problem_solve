package palindrome;


import java.util.Locale;

//Given a String, determine  if it is a palindrome, considering only alphanumeric chars and ignoring cases
public class ValidPalindrome {
    public static void main(String[] args) {
        String result1 = "RacecaR";
        System.out.println(isPalindrome(result1));
        String result2 = "abcddcba";
        System.out.println(isPalindromeAl(result2));
    }
    public static boolean isPalindrome(String s) {
        String fixed_char = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixed_char += c;
            }
        }
        fixed_char = fixed_char.toLowerCase();
        int a_pointer = 0;
        int b_pointer = s.length()-1;
        while (a_pointer <= b_pointer) {
            if (fixed_char.charAt(a_pointer) != fixed_char.charAt(b_pointer)) {
                return false;
            }
            a_pointer ++;
            b_pointer --;
        }
        return true;
    }
    public static boolean isPalindromeAl(String s) {
        int right = 0;
        int left = s.length() - 1;
        while (right < left) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
            right ++;
            left --;
        }
        return true;
    }


}
