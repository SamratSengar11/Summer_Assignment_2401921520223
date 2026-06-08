class Solution {
    public int maxSubArray(int[] nums) {
        int prefix=0;
         int Maxi=Integer.MIN_VALUE;
         for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            Maxi=Math.max(prefix,Maxi);
            if(prefix<0) prefix=0;
         }
        
    return Maxi; }
}
