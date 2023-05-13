class Solution {
    public static boolean makePalindrome(int n, String[] arr) {

        Map<String, Integer> mm = new HashMap<>();
        int odd = 0;
        for (String x : arr) {
            mm.putIfAbsent(x, 0);
            mm.put(x, mm.get(x) + 1);
        }
        for (Map.Entry<String, Integer> x : mm.entrySet()) {
            StringBuilder t = new StringBuilder(x.getKey());
            t.reverse();
            String temp = t.toString();
            if (temp.equals(x.getKey())) {
                if ((x.getValue() % 2) == 1)
                    odd++;
                if (odd > 1)
                    return false;
            } else if (mm.get(temp) != x.getValue())
                return false;
        }
        return true;
    }
}
