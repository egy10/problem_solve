package fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
        System.out.println(fibFaster(n));

    }
    public static int fib(int N) {
        if (N == 0 ) return 0; //Base case
        if (N == 1) return 1;

        return fib(N-1) + fib(N-2); //Recursive calling yourself with a smaller sub-problem
    }
    //Second faster approach
    //Doesn't use any space and it just use variables
    public static int fibFaster(int N) {
        if (N == 0 ) return 0;
        if (N == 1) return 1;

        int a = 0;
        int b = 1;
        int sum = a + b;
        while (N > 1) {
            sum = a + b;
            a = b;
            b = sum;
            N--;
        }
        return sum;
    }
}
//0,1,1,2,3,5,8 It's recursive problem: It means making your own functions call and number is fibonacci
//F(0) = 0; F(1) = 1; F(N) = F(N-1) + F(N-2), for N>1