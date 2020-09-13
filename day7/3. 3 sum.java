class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        int l=0;
        int r=nums.length-1;
        int i;
        int sum;
        for( i=0;i<nums.length;i++){
            sum=0-nums[i];
            if(i!=0&&nums[i]==nums[i-1])continue;
            l=i+1;r=nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]==sum){
                    List <Integer> temp= new ArrayList <Integer>();
                    temp.add(nums[i]);temp.add(nums[l]);temp.add(nums[r]);
                    ans.add(temp);
                    while(l<nums.length-1 && nums[l]==nums[l+1])l++;
                    l++;r--;
                }
                else if(nums[l]+nums[r]<sum){
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        
        return ans;
    }
}
