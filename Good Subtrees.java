class Solution {
    static int cnt = 0;

    static Map<Integer, Integer> getGood(Node root, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        Map<Integer, Integer> hm1 = new HashMap<>();
        Map<Integer, Integer> hm2 = new HashMap<>();
        if (root.left != null) {
            hm1 = getGood(root.left, k);
        }
        if (root.right != null) {
            hm2 = getGood(root.right, k);
        }
        if (hm1.size() > k)
            return hm1;
        if (hm2.size() > k)
            return hm2;
        hm.putIfAbsent(root.data, k);
        hm.put(root.data, hm.get(root.data) + 1);
        for (Map.Entry<Integer, Integer> x : hm1.entrySet()) {
            hm.putIfAbsent(x.getKey(), 0);
            hm.put(x.getKey(), hm.get(x.getKey()) + x.getValue());
        }
        for (Map.Entry<Integer, Integer> x : hm2.entrySet()) {
            hm.putIfAbsent(x.getKey(), 0);
            hm.put(x.getKey(), hm.get(x.getKey()) + x.getValue());
        }
        if (hm.size() <= k)
            cnt++;
        return hm;
    }

    public static int goodSubtrees(Node root, int k) {
        cnt = 0;
        getGood(root, k);
        return cnt;
    }
}
