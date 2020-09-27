class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> decre = new Stack<>();
        int [] ans=new int [nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(!decre.isEmpty()&&decre.peek()<=nums[i])decre.pop();
            decre.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!decre.isEmpty()&&decre.peek()<=nums[i])decre.pop();
            ans[i] = decre.isEmpty()? -1 : decre.peek();
            decre.push(nums[i]);
        }
        return ans;
    }
}
