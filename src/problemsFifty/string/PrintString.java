package problemsFifty.string;

public class PrintString {
    public static void main(String[] args) {
        String s = "Enkhee" ;
        System.out.println(s);
        System.out.println("Name is: " + s);

        String result = " !Hello User!! Welcome";
        System.out.println(result);

        //Print first character of every word
        char a[] = result.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' '){
                if (i == 0) {
                    System.out.println(a[i]);
                }else if (a[i-1] == ' '){
                    System.out.println(a[i]);
                }
            }
        }

    }



}
