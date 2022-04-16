package reverse;

public class Reverse {
    public static void main(String[] args) {
        int result = -1234554;
        System.out.println(reverse(result));
    }
    public static long reverse(int input) {
        long reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return reversed;
    }
}
//input = 54321 getting digit by one one output= 12345
//input % 10
//reversed = input % 10
//