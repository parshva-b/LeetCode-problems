class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1, sSkip = 0, tSkip = 0;
        
        while(i >= 0 || j>=0) {
            while(i>=0) {
                if(S.charAt(i) == '#') {sSkip++; i--;}
                else if(sSkip > 0) {sSkip--; i--;}
                else break;
            }
            while(j>=0) {
                if(T.charAt(j) == '#') {tSkip++; j--;}
                else if(tSkip > 0) {tSkip--; j--;}
                else break;
            }
            
            if(i>=0 && j>=0 && S.charAt(i) != T.charAt(j)) return false;
            if((i>=0) != (j>=0)) return false;
            i--;
            j--;
        }
        return true;
    }
}