class Solution {
    public static ArrayList<Character> easyTask(int n, String s, int q, query queries[]) {
        char arr[] = s.toCharArray();
        ArrayList<Character> ans = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            if (queries[i].type.equals("1")) {
                arr[Integer.valueOf(queries[i].a)] = queries[i].b.charAt(0);
            } else if (queries[i].type.equals("2")) {
                int freq[] = new int[26];
                int a = Integer.valueOf(queries[i].a);
                int b = Integer.valueOf(queries[i].b);
                int c = Integer.valueOf(queries[i].c);

                for (int j = a; j <= b; j++) {
                    freq[arr[j] - 97]++;
                }
                int count = 0;

                for (int j = 25; j >= 0; j--) {
                    if (freq[j] != 0) {

                        count = count + freq[j];

                        if (count >= c) {
                            ans.add((char) (j + 97));
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
