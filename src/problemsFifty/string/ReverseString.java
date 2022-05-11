package problemsFifty.string;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String result = "Hello World!"; //Output: !dlroW olleH
        System.out.println(reverseString(result));
        System.out.println(reverseStringTwo(result)); //Output: dlroW olleH
    }
    // 1.
    public static String reverseString(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s;
        }
        return s;
    }
    //2.
    public static void printReverseString(String s){
        int start = 0;
        int end = s.length() - 1;
        char ch[] = s.toCharArray();

        while (start < end){
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;

            start ++;
            end --;
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.println(ch[i] + " ");
        }
    }
    // 3.
    public static String reverseStringTwo(String s) {
        int start = 0;
        int end = s.length() -1;

        char[] ch = s.toCharArray();

        while (start < end) {
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;

            start ++;
            end --;
        }
        return String.valueOf(ch);
    }
    //4.
    public void reverseStack(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i)); //push the value each one by one
        }
        while (!st.isEmpty()){
            System.out.println(st.pop()); // if stack is not empty you
        }
    }
}
