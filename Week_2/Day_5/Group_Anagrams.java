class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> groups = new HashMap<>();

        for (String ele : strs) {
            char[] letters = ele.toCharArray();
            Arrays.sort(letters);

            String key = new String(letters);

            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(ele);
        }

        return new ArrayList<>(groups.values());
    }
}
