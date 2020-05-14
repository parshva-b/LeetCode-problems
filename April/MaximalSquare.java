class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[i].length; j++) {
                dp[i][j] = Character.getNumericValue(matrix[i][j]);
            }
        }
        
        int max = 0;
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[i].length; j++) {
                if( !(i==0 || j==0) && dp[i][j] == 1) {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
                if(dp[i][j] > max) max = dp[i][j];
            }
        }
        
        return max*max;
    }
}