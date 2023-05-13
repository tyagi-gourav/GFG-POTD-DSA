class Solution {
    public static int powerfullInteger(int n, int interval[][], int k) {
        int max = Integer.MIN_VALUE;
        int a = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(interval[i][0], a++);
            hm.put(interval[i][1], a++);
        }
        for (Map.Entry<max, a> entry : hm.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

}
