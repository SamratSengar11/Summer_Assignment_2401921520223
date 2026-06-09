class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double  maxi=-Double.MAX_VALUE;
        for(int i=0;i<k;i++){
             sum+=nums[i];
        } 
        maxi=Math.max(maxi,sum);
        for( int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            maxi=Math.max(sum,maxi);
        }      
    return maxi/k; }
}
