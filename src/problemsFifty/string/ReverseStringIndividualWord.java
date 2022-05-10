package problemsFifty.string;

public class ReverseStringIndividualWord {
    public static void main(String[] args) {
        String result = "  Hello     Mongolia!";
        System.out.println(reverseIndividualWord(result));
        // output: olleH     !ailognoM
        System.out.println(reverseWordStringBuilder(result));
    }
//  1.
    public static String reverseIndividualWord(String str) {
        String finalStr = "";
        String tmpString = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                finalStr = finalStr + tmpString + " ";
                tmpString = "";
            } else {
                tmpString = c + tmpString;
            }
        }
        finalStr = finalStr + tmpString;
        return finalStr;
    }
    //2.
    public static String reverseWordStringBuilder(String  str) {
        StringBuilder finalStr = new StringBuilder(); //not thread safe
        StringBuilder tmpStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' '){
                finalStr = finalStr.append(tmpStr).append(' ');
                tmpStr.setLength(0);
            } else {
                tmpStr.insert(0, c);
            }
        }
        finalStr = finalStr.append(tmpStr);
        return finalStr.toString();
    }
}
