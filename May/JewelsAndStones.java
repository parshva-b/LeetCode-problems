class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> stones = new HashSet<>();
        
        for(char c: J.toCharArray()) stones.add(c);
        
        int count = 0;
        for(char c: S.toCharArray()) {
            if(stones.contains(c)) count++;
        }
        
        return count;
    }
}