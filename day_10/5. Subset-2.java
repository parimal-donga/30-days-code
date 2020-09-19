class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        done(ans,new ArrayList<Integer>(),nums,0);
        return ans;
    }
    public static void done(List<List<Integer>> ans,List<Integer> temp, int [] nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        if(i<nums.length-1&& nums[i]==nums[i+1]){
            int loop=1,ik=i,p=nums[i];
            while(ik<nums.length&&nums[ik]==p)ik++;
            done(ans,temp,nums,ik);
            while(i<ik){
                temp.add(p);
                done(ans,temp,nums,ik);
                i++;loop++;
            }
            while(loop--!=1)temp.remove(temp.size()-1);
        }
        else {
            done(ans,temp,nums,i+1);
            temp.add(nums[i]);
            done(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
