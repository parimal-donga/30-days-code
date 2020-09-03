class Solution {
    public int findDuplicate(int[] nums) {
        int ok=0;
        int ok2=0;
        while(ok!=-1){
            ok=nums[ok];
            ok2=nums[nums[ok2]];
            if(ok==ok2){
                ok=0;
                while(ok!=ok2){
                    ok=nums[ok];
                    ok2=nums[ok2];
                }
                return ok;
            }
        }
        return 0;
    }
}
