class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        int z=0;
        int on=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='1'){
                if(z!=0){
                    if(on==0&&z>X){
                        return false;
                    }else if(z>X*2){
                        return false;
                    }
                }
                on=1;
                z=0;
            }else{
                z++;
            }}
            if(z!=0){
                if(on==0||z>X){
                    return false;
                }
            }
        
        return true;
    }
} 