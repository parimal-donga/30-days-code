class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean ns[] = new boolean [nums.length];
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        solve(ans,ns,nums,temp);
        return ans;
    }
    public static boolean solve(List<List<Integer>> ans,boolean [] ns, int nums[], List<Integer> temp){
        if(temp.size()==nums.length){
            List<Integer> temp2 = new ArrayList<Integer>(temp);
            ans.add(temp2);
            return true;
        }
        for(int i=0;i<nums.length;i++){
            if(ns[i]==false){
                ns[i]=true;
                temp.add(nums[i]);
                solve(ans,ns,nums,temp);
                temp.remove(temp.size()-1);
                ns[i]=false;
            }
        }
        return true;
    }
    
}
