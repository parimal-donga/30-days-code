public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Map <Integer,Integer> ok = new HashMap<>();
        int ans=0;
        ArrayList <Integer> a= new ArrayList<Integer>();
        a.add(A.get(0));
        for(int i=1;i<A.size();i++){
            a.add(a.get(i-1)^A.get(i));
        }
        //System.out.println(a);
        for(int i=0;i<A.size();i++){
            if(a.get(i)==B)ans++;
            int tp= a.get(i)^B;
            if(ok.containsKey(tp)){
                ans+=ok.get(tp);
            }
            if(ok.containsKey(a.get(i))){
                ok.put(a.get(i),ok.get(a.get(i))+1);
            }
            else ok.put(a.get(i),1);
        }
        return ans;
    }
}
