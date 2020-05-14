class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int ogColor = image[sr][sc];
        if(ogColor == newColor) return image;
        
        recurs(image, ogColor, newColor, sr, sc);
        return image;
    }
    
    public void recurs(int[][] image, int ogColor, int newColor, int row, int col) {
        if(row >= image.length || row<0) return;
        if(col >= image[row].length || col < 0) return;
        
        if(image[row][col] == ogColor) {
            image[row][col] = newColor;
            recurs(image, ogColor, newColor, row, col+1);
            recurs(image, ogColor, newColor, row+1, col);
            recurs(image, ogColor, newColor, row-1, col);
            recurs(image, ogColor, newColor, row, col-1);
        }
    }
}