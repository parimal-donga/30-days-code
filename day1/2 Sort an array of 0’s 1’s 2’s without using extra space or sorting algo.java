class Solution {
    public void sortColors(int[] nums) {
        int [] ans = new int[3];
        int i;
        for(i=0;i<nums.length;i++)ans[nums[i]]++;
        for(i=0;i<ans[0];i++){
            nums[i]=0;
        }
        for(;i<ans[0]+ans[1];i++){
            nums[i]=1;
        }
        for(;i<nums.length;i++){
            nums[i]=2;
        }
    }
}
