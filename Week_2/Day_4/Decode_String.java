lass Solution {
    int index = 0;

    public String decodeString(String s) {
        return decode(s);
    }

    private String decode(String s) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (index < s.length()) {
            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                index++;
            } 
            else if (ch == '[') {
                index++; // skip '['

                String inner = decode(s);

                for (int i = 0; i < num; i++) {
                    result.append(inner);
                }

                num = 0;
            } 
            else if (ch == ']') {
                index++; // skip ']'
                return result.toString();
            } 
            else {
                result.append(ch);
                index++;
            }
        }

        return result.toString();
    }
}
