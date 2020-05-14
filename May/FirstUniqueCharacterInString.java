class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        
        for(char c: s.toCharArray()) {
            if(count.containsKey(c)) count.put(c, count.get(c)+1);
            else count.put(c, 1);
        }
        
        for(int i = 0; i < s.length();i++) {
            if(count.get(s.charAt(i)) == 1) return i;
        }
        
        return -1;
    }
}