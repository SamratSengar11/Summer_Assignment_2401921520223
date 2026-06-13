class Solution {
    public boolean isAlpha(char ch){
        if((ch>='0' && ch<='9') || (Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z')) {
            return true;
        }
     return false;}

    public boolean isPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        while(i<=j){
           if( !isAlpha(s.charAt(i))){
            i++;
            continue;
           }
            if(! isAlpha(s.charAt(j))){
            j--;
            continue;
           }
           if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
            return false;
           }
           i++;
           j--;
        }



       return true; 
    }
}
