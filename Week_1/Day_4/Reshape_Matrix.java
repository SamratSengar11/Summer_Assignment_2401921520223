class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans=new int[r][c];
        int m= mat.length;
        int n=mat[0].length;
        if(r*c==m*n)
        {
            for(int i=0;i<=m*n-1;i++){
                ans[i/c][i%c]=mat[i/n][i%n];
            }
         
        }
        else return mat  ; 


        
    return ans;}
}
