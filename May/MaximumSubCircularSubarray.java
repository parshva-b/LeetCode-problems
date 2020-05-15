class Solution {
    public int maxSubarraySumCircular(int[] A) { 
        if(A.length == 0) return 0;
        if(A.length == 1) return A[0];
        int S = 0, N = A.length;
        for(int x: A) S+=x;
        
        int ans1 = kadane(A, 0, N-1, 1);
        int ans2 = S + kadane(A, 1, N-1, -1);
        int ans3 = S + kadane(A, 0, N-2, -1);

        return Math.max(ans1, Math.max(ans2, ans3));
    }
    
    public int kadane(int[] A, int i, int j, int sign) {
        int ans = Integer.MIN_VALUE, cur = Integer.MIN_VALUE;
        
        for(int k=i; k <= j; ++k) {
            cur = sign*A[k] + Math.max(cur,0);
            ans = Math.max(cur, ans);
        }
        return ans;
    }
}
