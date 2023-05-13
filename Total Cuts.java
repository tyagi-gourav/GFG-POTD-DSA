class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        int ans = 0, leftMax = -1, rightMin = Integer.MAX_VALUE;
        int[] left = new int[N];
        int[] right = new int[N];
        for (int i = 0; i < N; i++) {
            leftMax = Math.max(leftMax, A[i]);
            left[i] = leftMax;
        }
        for (int i = N - 1; i >= 0; i--) {
            rightMin = Math.min(rightMin, A[i]);
            right[i] = rightMin;
        }

        for (int i = 1; i < N; i++) {
            if (left[i - 1] + right[i] >= K)
                ans++;
        }
        return ans;
    }
}
