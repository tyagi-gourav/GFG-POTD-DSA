
class Solution {
    int[] nearestSmallestTower(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int left[] = new int[n];
        int right[] = new int[n];
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() != 0) {
                left[i] = st.peek();
            } else {
                left[i] = -1;
            }
            st.push(i);
        }
        while (st.size() != 0) {
            st.pop();
        }
        for (int i = n - 1; i >= 0; i--) {
            while (st.size() != 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.size() != 0) {
                right[i] = st.peek();
            } else {
                right[i] = -1;
            }
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]) {
                ans[i] = -1;
            } else if (left[i] == -1) {
                ans[i] = right[i];
            } else if (right[i] == -1) {
                ans[i] = left[i];
            } else if (i - left[i] < right[i] - i) {
                ans[i] = left[i];
            } else if (i - left[i] > right[i] - i) {
                ans[i] = right[i];
            } else if (arr[right[i]] < arr[left[i]]) {
                ans[i] = right[i];
            } else {
                ans[i] = left[i];
            }
        }
        return ans;
    }
}