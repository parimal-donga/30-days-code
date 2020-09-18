class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean ans[] = new boolean [s.length()+1];
        ans[0]=true;
        int i=0;
        for(;i<s.length();i++){
            for(String str : wordDict){
                if(ans[i]&&i+str.length()<=s.length()&&s.substring(i,i+str.length()).equals(str))ans[i+str.length()]=true;
            }
        }
       // System.out.println(Arrays.toString(ans));
        return ans[i];
    }
}
