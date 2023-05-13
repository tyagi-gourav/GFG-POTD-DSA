class Solution {
    static char help(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != '?') {
                return s.charAt(i);
            }
            if (s.charAt(j) != '?') {
                return s.charAt(j);
            }
            i++;
            j--;

        }
        return '#';
    }

    public static int minimumSum(String s) {
        int i = 0;
        int j = s.length() - 1;
        int ans = 0;
        char prev = '#';
        while (i <= j) {
            if (s.charAt(i) == '?' && s.charAt(j) == '?') {
                if (prev == '#') {
                    prev = help(s);
                    if (prev == '#') {
                        return 0;
                    }
                }
            } else if (s.charAt(i) == '?') {
                if (prev != '#') {
                    ans += 2 * Math.abs(prev - s.charAt(j));
                }
                prev = s.charAt(j);
            } else if (s.charAt(j) == '?') {
                if (prev != '#') {
                    ans += 2 * Math.abs(prev - s.charAt(i));
                }
                prev = s.charAt(i);
            } else if (s.charAt(i) == s.charAt(j)) {
                if (prev != '#') {
                    ans += 2 * Math.abs(prev - s.charAt(i));
                }
                prev = s.charAt(i);
            } else
                return -1;

            i++;
            j--;
        }
        return ans;
    }
}
