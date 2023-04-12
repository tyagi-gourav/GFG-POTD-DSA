class Solution {
    public static int dominantPairs(int n, int[] arr) {
        Arrays.sort(arr,0,n/2);
        Arrays.sort(arr,n/2,n);
        int ans=0;
        int j=n/2;
        for(int i=0;i<n/2;i++){
            while(j<n&&arr[i]>=arr[j]*5){
                j++;
            }
            ans+=j-n/2;
        }
        return ans;
         
        
    }
}