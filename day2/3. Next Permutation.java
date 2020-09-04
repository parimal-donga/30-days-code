class Solution {
    public void nextPermutation(int[] nums) {
        int i= nums.length-1,p;
        while(i>0&&nums[i]<=nums[i-1])i--;
        if(i>0){
            int n=nums.length-1;
            while(n>i&&nums[n]<=nums[i-1])n--;
            p=nums[i-1];nums[i-1]=nums[n];nums[n]=p;
        }
        int j=(nums.length-1);
        while(i<j){
            p=nums[j];nums[j]=nums[i];nums[i]=p;i++;j--;
        }
    }
    
}
