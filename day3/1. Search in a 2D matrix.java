class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=0;
        if(matrix.length==0)return false;
        if(matrix[0].length==0)return false;
        int n= matrix.length,m=matrix[0].length;
        while(i<n&&!(target>=matrix[i][0]&&target<=matrix[i][m-1])){
            i++;
        }
        if(i==n)return false;
        while(j<m){if(matrix[i][j]==target)return true;j++;}
        return false;
    }
}
