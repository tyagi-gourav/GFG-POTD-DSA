lass Solution {
    public static long solve(int N, int[] A, int[] B) {
         long sum=0;
         long ans=0;
         ArrayList<Integer> EvenA=new ArrayList<>();
         ArrayList<Integer> OddA=new ArrayList<>();
         ArrayList<Integer> EvenB=new ArrayList<>();
         ArrayList<Integer> OddB=new ArrayList<>();
         Arrays.sort(A);
         Arrays.sort(B);
         for(int i=0;i<N;i++){
             sum+=(A[i]-B[i]);
             if(A[i]%2!=0){
                 OddA.add(A[i]);
             }else{
                 EvenA.add(A[i]);
             }
             if(B[i]%2!=0){
                 OddB.add(B[i]);
             }else{
                 EvenB.add(B[i]);
             }
         }
         if(sum!=0||OddA.size()!=OddB.size()){
             return -1;
         }
         for(int i=0;i<OddA.size();i++){
             ans+=(Math.abs(OddA.get(i)-OddB.get(i))/2);
         }
         for(int i=0;i<EvenA.size();i++){
             ans+=(Math.abs(EvenA.get(i)-EvenB.get(i))/2);
         }
         return ans/2;
    }
}