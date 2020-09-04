public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList <Integer>ans = new ArrayList<Integer>();
        boolean ok[]=new boolean[A.size()+1];
        for(int i=0;i<A.size();i++){
            int k=A.get(i);
            if(ok[k]==true){ans.add(k);}
            else ok[k]=true;
        }
        for(int i=1;i<A.size()+1;i++){
            if(ok[i]==false)ans.add(i);
        }
        return ans;
    }
}
