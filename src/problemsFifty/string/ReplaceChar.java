package problemsFifty.string;

public class ReplaceChar {
    public static void main(String[] args) {
        String s = "Hello World! Welcome to coding simplified";

        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'o' || ch[i] == 'O'){
                ch[i] = 'y';
            }
        }
        System.out.println(ch);
    }
}
