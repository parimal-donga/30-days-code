class Solution {
    public void setZeroes(int[][] matrix) {
        int i,j,n= matrix.length;
        int m = matrix[0].length;
        boolean r=false,c=false;
        if(matrix[0][0]!=0){
            for(i=0;i<n;i++)if(matrix[i][0]==0)c=true;
            for(i=0;i<m;i++)if(matrix[0][i]==0)r=true;
        }
        else {
            c=true;r=true;
        }
        for(i=1;i<n;i++){
            for(j=1;j<m;j++)
                if(matrix[i][j]==0)matrix[i][0]=matrix[0][j]=0;
        }
        for(i=1;i<n;i++){
            for(j=1;j<m;j++){
                if(matrix[i][0]==0||matrix[0][j]==0)matrix[i][j]=0;
            }
        }
        if(c)for(i=0;i<n;i++)matrix[i][0]=0;
        if(r)for(j=0;j<m;j++)matrix[0][j]=0;
    }
}
