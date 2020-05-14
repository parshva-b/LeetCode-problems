class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] votes = new int[N];
        Set<Integer> givenVote = new HashSet<>();
        
        for(int i = 0; i < trust.length; i++) {
            givenVote.add(trust[i][0]);
            votes[trust[i][1]-1]++; 
        }
        
        for(int i = 1; i <= votes.length; i++) {
            if(votes[i-1]==N-1 && !givenVote.contains(i)) return i;
        }
        
        return -1;
    }
}