package LearnigDp;

import java.util.Arrays;

public class Dp1 {
    static int[] dp;

    public static int fib(int n){

        if(dp[n] != -1) return dp[n];

        if(n <= 1){
            return n;
        }

        return dp[n] = fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        dp = new int[n+1];

        Arrays.fill(dp, -1);

        System.out.println("Fibonacci series up to " + n + "terms");
        for(int i = 0 ; i < n ;i++){
            System.out.print(fib(i)+ " ");
        }
    }
}
