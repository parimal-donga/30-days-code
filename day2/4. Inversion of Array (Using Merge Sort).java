class Solution {
    public int reversePairs(int[] nums) {
        return pp(nums,0,nums.length-1);
    }
    
    public int pp(int []ar,int s,int e){
        if(s<e){
            int m=(s+e)/2;
            int c=pp(ar,s,m);
            c+= pp(ar,m+1,e);
            c+=p(ar,s,m,e);
            return c;
        }
        else return 0;
    }
    public static int p(int [] ar,int s,int m,int e){
        int [] ok1=Arrays.copyOfRange(ar,s,m+1);
        int [] ok2=Arrays.copyOfRange(ar,m+1,e+1);
        int i=0,j=0,k=s;
        int c=0;
        while(j<ok2.length && (i<ok1.length)){
            if(ok1[i]>(long)2*(long)ok2[j]){
                c+=ok1.length-i;j++;k++;
            }
            else {
                i++;
            }
        }
        i=0;j=0;k=s;
        while(j<ok2.length && (i<ok1.length)){
            if(ok1[i]<ok2[j]){
                ar[k++]=ok1[i++];
            }
            else {
                ar[k++]=ok2[j++];
            }
        }
        while(j<ok2.length){ar[k++]=ok2[j++];}
        while(i<ok1.length){ar[k++]=ok1[i++];}
        return c;
    }
}
