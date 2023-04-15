class Solution {
    public static long totalTime(int n, int arr[], int time[]) {
        HashMap hm = new HashMap();
        int tt = 0;
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], i);
                tt++;
            } else {
                tt += time[arr[i] - 1];
            }
        }
        return tt - 1;
    }
}