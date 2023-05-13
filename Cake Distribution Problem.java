class Solution {
    int maxSweetness(int[] sweetness, int N, int K) {
        int low = Integer.MAX_VALUE;
        int high = 0;
        int mid = 0;
        for (int i = 0; i < N; i++) {
            high += sweetness[i];
            low = Math.min(low, sweetness[i]);
        }
        int ans = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (isPossible(mid, sweetness, K) == true) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;

        }
        return ans;
    }

    static boolean isPossible(int mid, int arr[], int k) {
        int person = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= mid) {
                person++;
                sum = 0;
            }
        }
        return person >= k + 1;
    }
}
