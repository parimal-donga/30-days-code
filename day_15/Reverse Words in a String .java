class Solution {
    public String reverseWords(String s) {
        char ok [] = s.toCharArray();
        int n=ok.length;
        reverse(ok,0,n-1);
        int i=0,j=0;
        for(;i<n;){
            while(i<n&&ok[i]==' ')i++;
            j=i;
            while(i<n&&ok[i]!=' ')i++;
            reverse(ok,j,i-1);
        }
        return new String(ok).trim().replaceAll(" +"," ");
    }
    static void reverse(char [] c, int i, int j){
        char tk;
        while(i<j){
            tk=c[i];
            c[i]=c[j];
            c[j]=tk;
            i++;j--;
        }
    }
}
