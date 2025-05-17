package org.example;

public class Main {
    public static void main(String[] args) {
        for (int n = 1; n <= 15; n++) {
            System.out.printf("n = %d: %d\n", n, countWellFormedParenthesis(n));
        }
    }

    public static int countWellFormedParenthesis(int nCouples) {
        int[] dp = new int[nCouples + 1];
        dp[0] = 1;
        for (int i = 1; i <= nCouples; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }
        return dp[nCouples];
    }
}
