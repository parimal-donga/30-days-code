class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
/*
//boyer moore algo
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        Integer kk= null;
        for(int ok:nums){
            if(count==0)kk=ok;
            count+=(ok==kk)?1:-1;
        }
        return kk;
    }
}

*/
