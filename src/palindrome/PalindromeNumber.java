package palindrome;

//Determine whether an int is a palindrome. An integer is palindrome when it reads the same backward as forward;
public class PalindromeNumber {
    public static void main(String[] args) {
        int result = 1234321;
        System.out.println(isPalindrome(result));
    }

    public static boolean isPalindrome(int nums) {
        if (nums == 0) {
            return true;
        }
        if (nums < 0 || nums % 10 == 0) {
            return false;
        }
        int reversed = 0;
        while (nums > reversed) {
            int pop = nums % 10;
            nums /= 10;

            reversed = (reversed * 10) + pop;
        }
        if (nums == reversed || nums == reversed / 10) {
            return true;
        } else {
            return false;
        }
    }
}
