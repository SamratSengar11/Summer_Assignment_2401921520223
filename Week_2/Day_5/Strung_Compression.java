class Solution {
    public int compress(char[] chars) {
        int i = 0; // write pointer
        int j = 0; // read pointer

        while (j < chars.length) {
            char current = chars[j];
            int count = 0;

            // count same characters
            while (j < chars.length && chars[j] == current) {
                j++;
                count++;
            }

            // write character
            chars[i++] = current;

            // write count if >1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[i++] = c;
                }
            }
        }

        return i;
    }
}
