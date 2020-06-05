class Solution {
    int[] weights;
    int sum = 0;
    public Solution(int[] w) {
        weights = new int[w.length];
        for(int i = 0; i < w.length; i++) {
            sum+=w[i];
            weights[i] = sum;
        }
    }
    
    public int pickIndex() {
        double target = weights[weights.length - 1] * Math.random();
        int si = 0, ei = weights.length - 1;
        int res = -1;
        
        while(si <= ei) {
            int mid = si + (ei - si)/2;
            if(target < weights[mid]) {
                ei = mid - 1;
                res = mid;
            }
            else {
                si = mid + 1;
            }
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
