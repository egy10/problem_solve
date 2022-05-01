package reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordString {
    public static void main(String[] args) {
        String str = "Hello Mongolia, This is Enkhee";
        //output : Enkhee   is   This   Mongolia,   Hello
        System.out.println(reverseWord(str));

    }
    public static String reverseWord(String str){
        List<String> words = new ArrayList<>();
        int startWord = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (character == ' ') {
                words.add(str.substring(startWord, i));
                startWord = i;
            } else if (str.charAt(startWord) == ' ') {
                words.add(" ");
                startWord = i;
            }
        }
        words.add(str.substring(startWord));
        Collections.reverse(words);
        return String.join(" ", words);
    }

}
