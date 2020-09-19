class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> one = new ArrayList<Integer>();
        comb(ans,candidates,0,target, one);
        return ans;
    }
    static boolean comb(List<List<Integer>> ans, int [] coins, int i,int m,List<Integer> temp){
        if(m==0){
            List<Integer> ans2= new ArrayList<Integer>();
            ans2.addAll(temp);
            ans.add(ans2);
            return true;
        } 
        while(i<coins.length&&coins[i]<=m){
            if(i<coins.length-1&&coins[i]==coins[i+1]){
                int loop=1,ik=i,p=coins[i];
                while(ik<coins.length&&coins[ik]==p)ik++;
                while(i<ik){
                    temp.add(p);
                    comb(ans,coins,ik,m-p*loop,temp);
                    i++;loop++;
                }
                while(loop--!=1)temp.remove(temp.size()-1);
            }
            else{
                temp.add(coins[i]);
                comb(ans,coins,i+1,m-coins[i],temp);
                temp.remove(temp.size()-1);
                i++;
            }
        }
        return false;
    }
}
