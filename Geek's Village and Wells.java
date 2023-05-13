class Solution {
    public boolean isSafe(int i, int j, char[][] arr, boolean[][] visited) {
        return (i < arr.length && i >= 0 && j < arr[0].length && j >= 0 && (arr[i][j] == 'H' || arr[i][j] == '.')
                && visited[i][j] == false);
    }

    public void BFS(char c[][], int ans[][], boolean visited[][]) {
        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                if (c[i][j] == 'W') {
                    queue.add(new Pair(i, j, 0));
                    ans[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }
        while (queue.size() > 0) {
            Pair curr = queue.poll();
            int new_i = curr.x;
            int new_j = curr.y;
            int new_value = curr.value;
            if (isSafe(new_i + 1, new_j, c, visited)) {
                if (c[new_i + 1][new_j] == 'H')
                    ans[new_i + 1][new_j] = 2 * (new_value + 1);
                queue.add(new Pair(new_i + 1, new_j, new_value + 1));
                visited[new_i + 1][new_j] = true;
            }
            if (isSafe(new_i - 1, new_j, c, visited)) {
                if (c[new_i - 1][new_j] == 'H')
                    ans[new_i - 1][new_j] = 2 * (new_value + 1);
                queue.add(new Pair(new_i - 1, new_j, new_value + 1));
                visited[new_i - 1][new_j] = true;
            }
            if (isSafe(new_i, new_j + 1, c, visited)) {
                if (c[new_i][new_j + 1] == 'H')
                    ans[new_i][new_j + 1] = 2 * (new_value + 1);
                queue.add(new Pair(new_i, new_j + 1, new_value + 1));
                visited[new_i][new_j + 1] = true;
            }
            if (isSafe(new_i, new_j - 1, c, visited)) {
                if (c[new_i][new_j - 1] == 'H')
                    ans[new_i][new_j - 1] = 2 * (new_value + 1);
                queue.add(new Pair(new_i, new_j - 1, new_value + 1));
                visited[new_i][new_j - 1] = true;
            }
        }
    }

    public int[][] chefAndWells(int n, int m, char c[][]) {
        int ans[][] = new int[n][m];
        boolean visited[][] = new boolean[n][m];
        BFS(c, ans, visited);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ans[i][j] == 0 && c[i][j] == 'H')
                    ans[i][j] = -1;
            }
        }
        return ans;
    }
}
