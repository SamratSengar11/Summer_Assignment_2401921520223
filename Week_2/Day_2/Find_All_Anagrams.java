class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] alpha  = new int [26];
        List<Integer> list = new ArrayList<>(); 
        int start=0;
        int end=0;
        for(int i=0;i<p.length();i++){
            alpha[p.charAt(i)-'a']++;

        }
        int WindSize = p.length();
        for(int i=0;i<s.length();i++){
            int windidx=0;
            int idx=i;
            int [] window= new int[26];
            while(idx<s.length() && windidx<WindSize){
                window[ s.charAt(idx)-'a']++;
                idx++;windidx++;


            }
            if(Arrays.equals(alpha,window)) {
                list.add(i);

            }
        }
       return list; 
    }
}
