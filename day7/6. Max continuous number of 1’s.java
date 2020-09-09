class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]==1)j++;
            else{
                if(j-i>ans)ans=j-i;
                j++;i=j;
            }
        }
        if(nums[j-1]==1){
            if(j-i>ans)ans=j-i;
        }
        return ans;
    }
}
