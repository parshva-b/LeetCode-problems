class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int[][] matrix = new int[A.length+1][B.length+1];
        
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(A[i-1]==B[j-1]) matrix[i][j] = 1+matrix[i-1][j-1];
                else matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
            }
        }
        
        return matrix[matrix.length - 1][matrix[0].length - 1];
    }
}
