class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l = p.length(), n = s.length();
        List<Integer> ans = new ArrayList<>();
        if(n == 0) return ans;
        
        char[] P = new char[26];
        fillArray(P, p);
        
        for(int i = 0; i < n-l+1; i++) {
            String cur = s.substring(i, i+l);
            char[] S = new char[26];
            fillArray(S, cur);
            if(Arrays.equals(P, S)) ans.add(i);
        }
        
        return ans;
    }
    
    public void fillArray(char[] arr, String underReview) {
        for(char c: underReview.toCharArray()) arr[c-'a']++;
    }
}
