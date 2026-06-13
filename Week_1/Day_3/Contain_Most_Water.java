class Solution {
    public int maxArea(int[] height) {
        int  Max=0;
        int contain=0;
        int i=0;
        int j=height.length-1;
        while(i<=j){
            if(height[i]<height[j]){
                contain=height[i]*(j-i);
                Max=Math.max(contain,Max);
                i++;

            }
            else{
                contain=height[j]*(j-i);
                Max=Math.max(contain,Max);
                j--;


            }
        }

    return Max; }
}
