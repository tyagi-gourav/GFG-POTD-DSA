class Solution {
    public static int arrayOperations(int n, int[] arr) {
        int prev = -1, i, ans = 0;
        for (i = 0; i < n; i++)
            if (arr[i] == 0 && i - prev > 1) {
                ans++;
                prev = i;
            } else if (arr[i] == 0)
                prev = i;
        if (prev == -1)
            return prev;
        if (i - prev > 1)
            ans++;
        return ans;
    }
}