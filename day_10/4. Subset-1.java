class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        done(ans,new ArrayList<Integer>(),nums,0);
        return ans;
    }
    public static void done(List<List<Integer>> ans,List<Integer> temp, int [] nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        done(ans,temp,nums,i+1);
        temp.add(nums[i]);
        done(ans,temp,nums,i+1);
        temp.remove(temp.size()-1);
    }
}
