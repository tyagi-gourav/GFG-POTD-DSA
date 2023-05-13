class Solution {
    int modulo(String s, int m) {
        int ans = 0;
        int bit = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                ans += bit;
                ans %= m;
            }
            bit *= 2;
            bit %= m;

        }
        return ans;

    }
}
