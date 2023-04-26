class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {

        for (int i = 0; i < m; i++) {

            if (seats.length == 1 && seats[i] == 0) {
                seats[i] = 1;
                n--;
                break;
            }
            if (seats.length == 1 && seats[i] == 1) {
                break;
            }
            if (i == 0 && seats[i] == 0 && seats[i + 1] == 0) {
                seats[i] = 1;
                n--;
            }
            if (i == m - 1 && seats[i] == 0 && seats[i - 1] == 0) {
                seats[i] = 1;
                n--;
                break;
            }
            if (i != m - 1 && i != 0 && seats[i] == 0 && seats[i + 1] == 0 && seats[i - 1] == 0) {
                seats[i] = 1;
                n--;
            }
        }
        if (n <= 0) {
            return true;
        }
        return false;

    }
}
