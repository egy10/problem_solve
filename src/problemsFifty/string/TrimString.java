package problemsFifty.string;

public class TrimString {
    public static void main(String[] args) {
        String s = "    hello  user welcome    ";
        char a[] = s.toCharArray();
        int start = 0;
        int end = a.length -1;
        int count;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ') {
                start = i;
                break;
            }
        }
        for (int i = a.length - 1; i > start - 1; i--) {
            if (a[i] != ' '){
                end = i;
                break;
            }
        }
        count = end - start + 1;
        String result = new String(a, start, count);
        System.out.println(result);

    }
    // Java has trim(). also

}
// String s = "   hello   user  welcome     "
// char a[] = s.toCharArray
// Strins s = "    h e l l o      u  s  e  r        w  e  l  c  o  m  e         "
//             1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
//result = "hello user welcome"