package string;

public class ReverseString {
    public static void main(String[] args) {
        String result = "Hello World!";
        System.out.println(reverseWithStringBuilder(result));
        System.out.println(reverseManually(result));

    }
    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    public static String reverseManually(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
