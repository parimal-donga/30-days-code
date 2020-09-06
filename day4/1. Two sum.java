class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> ok = new HashMap<>();
        ok.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(ok.containsKey(target-nums[i])){
                return new int[] {ok.get(target-nums[i]),i};
            }
            ok.put(nums[i],i);
        }
        return new int[] {0,1};
    }
}
