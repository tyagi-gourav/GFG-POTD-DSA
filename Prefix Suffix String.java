class Solution {
    public int prefixSuffixString(String s1[], String s2[]) {
        int cnt = 0;
        for (String s : s2) {
            for (String wrd : s1) {
                if (wrd.startsWith(s) || wrd.endsWith(s)) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;

    }
}
