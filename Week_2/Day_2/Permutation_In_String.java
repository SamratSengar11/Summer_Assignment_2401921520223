class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int n=s1.length();
         int [] freq = new int[26];
         int i=0;
         int j=n-1;
         for(i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;

         }
          int Windsize=s1.length();
         for( i=0;i<s2.length();i++){
            int idx=i;  int windindx=0;
            int[] WindFreq = new int[26];
            while(windindx<Windsize && idx<s2.length()){
                WindFreq[s2.charAt(idx)-'a']++;
                idx++; windindx++;
            }
            if(Arrays.equals(freq,WindFreq)){
                return true;
            }
         }
         return false;


    }
}
