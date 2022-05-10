package problemsFifty.string;

public class ReverseWord {
    public static void main(String[] args) {
        String result = "Hello! Mongolai";
        System.out.println(reverseString(result));
        //output: //ialognoM !olleH

    }
    public static String reverseString(String str) {
        String s = " ";
        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s;
        }
        return s;
    }

}
