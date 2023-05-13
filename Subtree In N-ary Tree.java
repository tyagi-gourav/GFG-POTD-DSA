class Solution {
    Map<String, Integer> hm = new HashMap<>();

    String help(Node root) {
        String temp = String.valueOf(root.data);
        for (Node x : root.children) {
            String t = help(x);
            temp = temp + t + "*";
        }
        hm.putIfAbsent(temp, 0);
        hm.put(temp, hm.get(temp) + 1);
        return temp;
    }

    public int duplicateSubtreeNaryTree(Node root) {
        help(root);
        int ans = 0;
        for (Map.Entry<String, Integer> x : hm.entrySet()) {
            if (x.getValue() > 1) {
                ans++;
            }
        }
        return ans;
    }

}
