class Solution {
    public void solveSudoku(char[][] board) {
        boolean row [][] = new boolean [9][9];
        boolean col [][] = new boolean [9][9];
        boolean box [][] = new boolean [9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                row[i][board[i][j]-'1']=true;
                col[j][board[i][j]-'1']=true;
                box[(i/3)*3+j/3][board[i][j]-'1']=true;
            }
        }
        solve(board,row,col,box,0,0);
        return ;
    }
    public static boolean solve(char[][] board,boolean [][]row,boolean [][] col,boolean [][] box,int x, int y){
        if(x==9){return true;}
        if(y==9){
            if(solve(board,row,col,box,x+1,0)) return true;
            return false;
        }
        if(board[x][y]!='.'){
            if(solve(board,row,col,box,x,y+1)) return true;
            return false;
        }
        for(int i=0;i<9;i++){
            if(!(row[x][i] || col[y][i] || box[(x/3)*3+y/3][i])){
                row[x][i]=true;
                col[y][i]=true;
                box[(x/3)*3+y/3][i]=true;
                board[x][y]= (char)(i+'1');
                if(solve(board,row,col,box,x,y+1)) return true;
                row[x][i]=false;
                col[y][i]=false;
                box[(x/3)*3+y/3][i]=false;
            }
        }
        board[x][y]= '.';
        return false;
    }
    
}
