class Solution {
    public int maxIntersections(int[][] lines, int N) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int [] arr:lines){
            int src= arr[0];
            int end= arr[1];
            map.put(src,map.getOrDefault(src,0)+1);
            map.put(end+1,map.getOrDefault(end+1,0)-1);
        }
        int max=1;
        int presum=0;
        int [] sortedKeys=map.keySet().stream().sorted().mapToInt(Integer::intValue).toArray();
        for(int key: sortedKeys){
            presum+=map.get(key);
            max=Math.max(max,presum);
        }
        return max;
    }
}