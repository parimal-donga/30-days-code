class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0)return new int[0][];
        ArrayList<int[]> ans= new ArrayList<int[]>();
        Arrays.sort(intervals,(x,y)->Integer.compare(x[0], y[0]));
        int ok[]=new int [2];
        ok[0]=intervals[0][0];
        ok[1]=intervals[0][1];
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i+1][0]<=ok[1]){
                if(ok[1]<intervals[i+1][1])ok[1]=intervals[i+1][1];
            }
            else {
                int ok2[]=new int [2];
                ok2[0]=ok[0];ok2[1]=ok[1];
                ans.add(ok2);
                ok[0]=intervals[i+1][0];
                ok[1]=intervals[i+1][1];
            }
        }
        ans.add(ok);
        int [][] ans2= new int [ans.size()][];
        for(int i=0;i<ans.size();i++){
            ans2[i]=ans.get(i);
        }
        return ans2;
    }
}
