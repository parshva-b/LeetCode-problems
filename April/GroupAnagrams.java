class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> output = new HashMap<>();
        
        int[] count = new int[26];
        for(String x: strs) {
            Arrays.fill(count, 0);
            
            for(char c: x.toCharArray()) count[(int)c-'a']++;
            
            StringBuilder key = new StringBuilder();
            for(int i: count) key.append("."+i);
            
            if(!output.containsKey(key.toString())) {
                output.put(key.toString(), new ArrayList());
            }
            output.get(key.toString()).add(x);
        }
        
        return new ArrayList(output.values());
    }
}