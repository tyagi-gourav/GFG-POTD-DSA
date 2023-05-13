class Solution {
    public static String stringMirror(String str) {
        String s = "";
        int k = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            k = str.charAt(i) - 'a';
            if (str.length() == 1) {
                s = s + str.charAt(i);
                break;
            }

            if (k < min && i == 0 && str.charAt(i) == str.charAt(i + 1)) {
                s = s + str.charAt(i);
                min = Math.min(min, k);
                break;
            } else if (k <= min) {
                s = s + str.charAt(i);
                min = Math.min(min, k);
            } else {
                break;
            }
        }
        StringBuilder rs = new StringBuilder();
        rs.append(s);
        rs.reverse();
        s += rs.toString();
        return s;

    }
}
