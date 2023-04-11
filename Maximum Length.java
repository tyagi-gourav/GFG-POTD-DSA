class Solution {
    int solve(int a, int b, int c) {
        if((b+c)*2<a||(a+c)*2<b||(b+a)*2<c){
            return -1;
        }
        return a+b+c;
    }
};