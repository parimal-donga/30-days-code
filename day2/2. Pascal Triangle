class Solution {
    public List<List<Integer>> generate(int numRows) {
        int i,j;
        List <List<Integer>> ans= new ArrayList<List<Integer>>();
        List<Integer> ok= new ArrayList<Integer>();
        for(i=0;i<numRows;i++){
            for(j=0;j<i-1;j++)
                ok.set(j,ok.get(j)+ok.get(j+1));
            ok.add(0,1);
            ans.add(new ArrayList<Integer>(ok));
        }
        return ans;
    }
}
