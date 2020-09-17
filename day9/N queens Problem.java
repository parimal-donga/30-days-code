class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<List<String>>();
        boolean q [][]= new boolean [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)q[i][j]=false;
        }
        boolean row[] = new boolean[n];
        boolean dia1[] = new boolean[n+n];
        boolean dia2[] = new boolean[n+n];
        qin(ans,q,0,row,dia1,dia2);
        return ans;
    }
    public static boolean qin(List<List<String>> ans,boolean [][] q,int c,boolean [] row,boolean[] dia1, boolean[] dia2){
        if(c==q.length){
            ret(q,ans);
            return true;
        }
        for(int i=0;i<q.length;i++){
            if(!(row[i]||dia1[i+c]||dia2[i-c+q.length-1])){
                q[i][c]=true;
                row[i]=true;
                dia1[i+c]=true;
                dia2[i-c+q.length-1]=true;
                qin(ans,q,c+1,row,dia1,dia2);
                q[i][c]=false;
                row[i]=false;
                dia1[i+c]=false;
                dia2[i-c+q.length-1]=false;
            }
        }
        return false;
    }
    public static void ret(boolean [][] q, List<List<String>> ans){
        List<String> temp = new ArrayList<String>();
        char [][] qc = new char[q.length][q.length];
        for(int i=0;i<q.length;i++){
            for(int j=0;j<q.length;j++){
                if(q[i][j]==false)qc[i][j]='.';
                else qc[i][j]='Q';
            }
        }
        for(char [] tek : qc){
            temp.add(Arrays.toString(tek).replace(",", "").replace("[", "").replace("]", "").trim().replace(" ", ""));
        }
        ans.add(temp);
    }
}
