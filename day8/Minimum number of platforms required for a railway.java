public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int [] str = new int[A.size()];
        int [] end = new int[A.size()];
        for(int i=0;i<A.size();i++){
            str[i]=A.get(i).get(0);
            end[i]=A.get(i).get(1);
        }
        Arrays.sort(str);
        Arrays.sort(end);
        int sna=0;
        int ans=0;
        int i=0;int j=0;
        while(i<A.size()){
            if(str[i]<end[j]){
                sna++;i++;
            }
            else if(str[i]>end[j]){
                sna--;j++;
            }
            else {i++;j++;}
            if(ans<sna)ans=sna;
        }
        return ans;
    }
}
