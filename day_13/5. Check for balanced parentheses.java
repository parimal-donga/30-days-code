class Solution {
    public boolean isValid(String s) {
        Stack <Character>ans=new Stack<Character>();
        try{
            for(Character c :s.toCharArray()){
                if(c=='('||c=='{'||c=='[')ans.push(c);
                else if(ans.pop()!=(c-1-c/90))return false;
            }
        }
        catch (Exception e){return false;}
        if(ans.empty())return true;
        return false;
    }
}
