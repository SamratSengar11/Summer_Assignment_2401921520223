class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] charCount = new int[26];
        for(char i: magazine.toCharArray()){
            charCount[i-'a']++;

        }
        for(char i: ransomNote.toCharArray()){
           if( charCount[i-'a']==0) return false;
           charCount[i-'a']--;

        }
        

       return true; 
    }
  
