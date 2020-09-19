class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
        for(;i<coins.length&&coins[i]<=m;i++){
            temp.add(coins[i]);
            comb(ans,coins,i,m-coins[i],temp);
            temp.remove(temp.size()-1);
        }
        return false;
    }
}
