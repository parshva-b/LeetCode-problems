class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(char c: s.toCharArray()) count.put(c, count.getOrDefault(c,0)+1);
        
        ArrayList<Map.Entry<Character, Integer>> sort = new ArrayList<>(count.entrySet());
        Collections.sort(sort, new Comparator<Map.Entry<Character, Integer>>() {
            
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        
        StringBuilder res = new StringBuilder();
        for(Map.Entry<Character, Integer> m: sort) {
            int tCount = m.getValue();
            while(tCount > 0) {
                res.append(m.getKey());
                tCount--;
            }
        }
        
        return res.toString();
    }
}
