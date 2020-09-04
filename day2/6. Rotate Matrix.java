class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int i,j,temp;
        int r = n%2==0? n/2 : (n/2+1);
        for(i=0;i<r;i++){
            for(j=i;j<n-i-1;j++){
                temp = matrix[n-j-1][i];
                matrix[n-j-1][i]= matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]= matrix[j][n-i-1];
                matrix[j][n-i-1]= matrix[i][j];
                matrix[i][j]= temp;
            }
        }
    }
}
