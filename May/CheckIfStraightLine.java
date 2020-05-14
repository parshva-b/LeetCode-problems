class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        final double THRESHOLD = 0.1;
        
        if(coordinates.length == 2) return true;
        
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        
        double m = (double)(y2-y1)/(x2-x1);
        
        for(int i = 1; i < coordinates.length - 1; i++) {
            x1 = coordinates[i][0]; y1 = coordinates[i][1];
            x2 = coordinates[i+1][0]; y2 = coordinates[i+1][1];
            
            double mo = (double)(y2-y1)/(x2-x1);
            
            if(m != mo) return false;
        }
        
        return true;
    }
}