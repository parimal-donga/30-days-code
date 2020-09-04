class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        if(n==Integer.MIN_VALUE){
            if(x>1)return 0;
            else if(x==1)return 1;
        }
        
        if(n<0){n=Math.abs(n);x=1/x;}
        while(n>0){
            if((n&1)!=0)
                ans*=x;
            x*=x;
            n>>=1;
        }
        return ans;
    }
}
