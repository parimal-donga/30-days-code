class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<List<String>>();
        List <String> temp = new ArrayList<String>();
        char a[] = s.toCharArray();
        done(ans,temp,a,0);
        return ans;
    }
    public static boolean done(List<List<String>> ans,List<String> temp,char a[],int i){
        if(i==a.length){
            List <String> temp2= new ArrayList<String>();
            temp2.addAll(temp);
            ans.add(temp2);
            return true;
        }
        int j=i;
        temp.add(new String(a).substring(i,j+1));
        done(ans,temp,a,j+1);
        temp.remove(temp.size()-1);
        j++;
        while(j<a.length){
            if(palin(a,i,j)){
                temp.add(new String(a).substring(i,j+1));
                done(ans,temp,a,j+1);
                temp.remove(temp.size()-1);
            }
            j++;
        }
        return false;
    }
    public static boolean palin(char[] a, int i, int j){
        while(i<j){
            if(a[i]!=a[j])return false;
            i++;j--;
        }
        return true;
    }
}
