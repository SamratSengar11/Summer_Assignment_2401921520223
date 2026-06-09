class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         ArrayList<Integer> ans = new ArrayList<>();
        int m=arr[0].length; int n=arr.length;
        int firstrow=0 , firstCol=0, lastCol=m-1, lastrow=n-1;
        int tne=m*n;
        while(ans.size()<tne){
            for(int j=firstCol;j<=lastCol;j++){
                ans.add(arr[firstrow][j]);
                

            }
            firstrow++;
            if(ans.size()==tne) break;
            for(int i=firstrow;i<=lastrow;i++){
                ans.add(arr[i][lastCol]);
               

            }
             lastCol--;
             if(ans.size()==tne) break;
            for(int j=lastCol;j>=firstCol;j--){
                ans.add(arr[lastrow][j]);
                
            }
            lastrow--;
            if(ans.size()==tne) break;

            for(int i=lastrow;i>=firstrow;i--){
                ans.add(arr[i][firstCol]);
               

            }
             firstCol++;
             if(ans.size()==tne) break;
           
           
        }
        return ans;
        
    }
}
