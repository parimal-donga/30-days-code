class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List <List <Integer>> ans = new ArrayList<>();
        if(nums.length<4)return ans;
        Arrays.sort(nums);
        Map<Integer,Integer> ok= new HashMap<>();
        ok.put(nums[0],0);
        int n=nums.length,i,j,k;
        for(i=1;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(ok.containsKey(target-nums[i]-nums[j]-nums[k])){
                        List<Integer> pp = new ArrayList<> ();
                        pp.add(nums[ok.get(target-nums[i]-nums[j]-nums[k])]);
                        pp.add(nums[i]);pp.add(nums[j]);pp.add(nums[k]);
                        if(!ans.contains(pp))ans.add(pp);
                    }
                }
            }
            ok.put(nums[i],i);
        }
        return ans;
    }
}
