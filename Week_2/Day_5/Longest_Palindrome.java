class Solution {
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int MaxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            int odd = expand(s, i, i);      
            int even = expand(s, i, i + 1); 

            int currentLen = Math.max(odd, even);

            if (currentLen > MaxLen) {
                MaxLen = currentLen;
                start = i - (currentLen - 1) / 2;
            }
        }

        return s.substring(start, start + MaxLen);
    }

    private int expand(String str, int left, int right) {
        while (left >= 0 && right < str.length() 
                && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
