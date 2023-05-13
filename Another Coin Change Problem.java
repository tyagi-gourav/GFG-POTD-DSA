class Solution {
    public static boolean makeChanges(int n, int K, int target, int[] coins) {
        boolean dp[][] = new boolean[K + 1][target + 1];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= K; j++) {
                for (int l = 1; l <= target; l++) {
                    if (coins[i] <= l && dp[j][l] == false) {
                        dp[j][l] = dp[j - 1][l - coins[i]];
                    }
                }
            }
        }
        return dp[K][target];
    }
}
