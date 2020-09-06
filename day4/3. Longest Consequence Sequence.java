class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        Map <Integer,Integer> ok= new HashMap<>();
        Map <Integer,Integer> ok2= new HashMap<>();
        int k,v,x;
        int ans=1;
        for(int i=0;i<nums.length;i++){
            x=nums[i];
            if(i>0&&x==nums[i-1])continue;
            if(ok.containsKey(x+1)){
                v=ok.get(x+1);
                ok.remove(x+1);
                ok2.remove(v);
                if(ok.containsValue(x-1)){
                    k=ok2.get(x-1);
                    ok.remove(k);
                    ok2.remove(x-1);
                }
                else{
                    k=x;
                }
                ok.put(k,v);
                ok2.put(v,k);
                if(v-k+1>ans)ans=v-k+1;
            }
            else if(ok2.containsKey(x-1)){
                k=ok2.get(x-1);
                ok.remove(k);
                ok2.remove(x-1);
                ok.put(k,x);
                ok2.put(x,k);
                if(x-k+1>ans)ans=x-k+1;
            }
            else {
                ok.put(x,x);
                ok2.put(x,x);
            }
        }
        return ans;
    }
}


/*
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Map <Integer,Integer> ok= new HashMap<>();
        int k,v,x;
        int ans=1;
        for(int i=0;i<nums.length;i++){
            x=nums[i];
            if(!ok.containsKey(x)){
                k = ok.containsKey(x-1)?ok.get(x-1):0;
                v = ok.containsKey(x+1)?ok.get(x+1):0;
                ans = Math.max(k+v+1,ans);
                ok.put(x-k,k+v+1);
                ok.put(x+v,k+v+1);
                ok.put(x  ,k+v+1);
            }
        }
        return ans;
    }
}
*/
