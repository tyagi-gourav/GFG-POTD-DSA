class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        Stack<Integer> c=new Stack<>();
        Stack<Integer> r=new Stack<>();
        c.add(color[0]);
        r.add(radius[0]);
        for(int i=1;i<N;i++){
            if(c.isEmpty()){
                c.push(color[i]);
                r.push(radius[i]);
                continue;
                
            }
            if(c.peek()==color[i]&&r.peek()==radius[i]){
                c.pop();
                r.pop();
            }else{
                c.push(color[i]);
                r.push(radius[i]);
            }
        }
        return c.size();
        
    }
}