class Solution {
    public String getPermutation(int n, int k) {
        int fact=1,i=1;k--;
        while(i++<n)fact=fact*i;
        boolean a [] = new boolean [n];
        Arrays.fill(a,true);
        i=0;
        char ans [] = new char [n];
        while(n>0){
            ans[i++]=find(a,k/(fact/n));
            k%=(fact/n);    fact/=n;    n--;
        }
        return new String(ans);
    }
    public static char find(boolean [] a, int k){
        for(int i=0;i<a.length;i++){
            if(a[i])
                if(k==0){
                    a[i]=false;return (char)(i+'1');
                }
                else k--;
        }
        return 0;
    }
}
