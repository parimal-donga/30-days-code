class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int L=0,R=0;
        int ans=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>L)L=height[l];
                else ans+= L-height[l];
                l++;
            }
            else{
                if(height[r]>R)R=height[r];
                else ans+= R-height[r];
                r--;
            }
        }
        return ans;
    }
}
