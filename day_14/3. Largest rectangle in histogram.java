class Solution {
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        if(n==0)return 0;
        Stack<ArrayList <Integer>> st= new Stack<>();
        st.add(new ArrayList<Integer>(Arrays.asList(heights[0],0,0)));
        int ans=heights[0];
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(0);temp.add(0);
        //System.out.printf("%s \n",st.toString());
        //System.out.printf("%d ",ans);
        for(int i=1;i<n;i++){
            if(ans<heights[i])ans=heights[i];
            if(st.peek().get(0)<heights[i]){
                st.add(new ArrayList<Integer>(Arrays.asList(heights[i],i,i)));
            }
            else if(st.peek().get(0)>heights[i]){
                while(!st.empty()&&st.peek().get(0)>heights[i]){
                    ans=Math.max(ans,st.peek().get(0)*(i-st.peek().get(1)));
                    st.pop();
                }
                if(st.empty())st.add(new ArrayList<Integer>(Arrays.asList(heights[i],0,i)));
                else st.add(new ArrayList<Integer>(Arrays.asList(heights[i],st.peek().get(2)+1,i)));
                ans=Math.max(ans,st.peek().get(0)*(i+1-st.peek().get(1)));
            }
            else{
                st.peek().set(2,i);
                ans=Math.max(ans,st.peek().get(0)*(i+1-st.peek().get(1)));
            }
            //System.out.printf("%d ",ans);System.out.printf("%s \n",st.toString());
        }
        while(!st.empty()){
            ans=Math.max(ans,st.peek().get(0)*(n-st.peek().get(1)));
            st.pop();
        }
        return ans;
    }
}
