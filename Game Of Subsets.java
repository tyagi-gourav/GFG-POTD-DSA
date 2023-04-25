class Solution {

    public int goodSubsets(int[] arr, int n) {
        int ar[]= new int[31];
        ar[2]=1;
        ar[3]=2;
        ar[5]=4;
        ar[6]=3;
        ar[7]=8;
        ar[10]=5;
        ar[11]=16;
        ar[13]=32;
        ar[14]=9;
        ar[15]=6;
        ar[17]=64;
        ar[19]=128;
        ar[21]=10;
        ar[22]=17;
        ar[23]=256;
        ar[26]=33;
        ar[29]=512;
        ar[30]=7;
        int freq[]=new int[31];
        int cnt=0;
        for(int x:arr){
            if(x==1){
                cnt++;
            }else{
                freq[x]++;
            }
        }
        long dp[]=new long[1024];
        int mod=1000000007;
        dp[0]=1;
        for(int j=2;j<31;j++){
            if(freq[j]!=0&&ar[j]!=0){
                for(int i=0;i<1024;i++){
                    if((ar[j]&i)==0){
                        dp[(ar[j]|i)]+=(freq[j]*dp[i]);
                        dp[(ar[j]|i)]%=mod;
                    }
                }
            }
        }
        int ans=0;
        for(int i=1;i<1024;i++){
            ans+=dp[i];
            ans%=mod;
        }
        while(cnt!=0){
            ans*=2;
            ans%=mod;
            cnt--;
        }
        return ans;
    }
};
