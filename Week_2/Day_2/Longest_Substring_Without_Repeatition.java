class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique =new HashSet<>();
        int n=s.length();
        int maxi=0;
        int left=0;
        for(int right=0;right<n;right++){
            while(unique.contains(s.charAt(right))){
                unique.remove(s.charAt(left));
                left++;
            }
            unique.add(s.charAt(right));
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
        
        
    }
}
