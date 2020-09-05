class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0;
        Integer n1=null,n2=null;
        for(int n:nums){
            if(n1!=null&&n1==n)c1++;
            else if(n2!=null && n2==n)c2++;
            else if(c1==0){n1=n;c1++;}
            else if(c2==0){n2=n;c2++;}
            else{c1--;c2--;}
        }
        c1=0;c2=0;
        for(int n:nums)if(n1!=null&&n1==n)c1++;
        for(int n:nums)if(n2!=null && n2==n)c2++;
        List <Integer>  ans= new ArrayList<Integer>();
        if(c1>nums.length/3)ans.add(n1);
        if(c2>nums.length/3)ans.add(n2);
        return ans;
    }
}
