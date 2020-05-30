class Solution {
    class Point {
        int x, y, distance;
        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    
    class DistanceComparator implements Comparator<Point> {
        public int compare(Point a, Point b) {
            return b.distance-a.distance;    
        }
    }
    
    public int computeDistance(int[] p) {
        return p[0]*p[0] + p[1]*p[1];
    }
    
    public int[][] kClosest(int[][] points, int K) {
        if(points == null) return new int[0][];
        
        PriorityQueue<Point> pq = new PriorityQueue<Point>(new DistanceComparator());
        for(int[] point: points) {
            pq.add(new Point(point[0], point[1], computeDistance(point)));
            if(pq.size()>K)
                pq.poll();
        }
        
        int[][] ans = new int[K][2];
        int i = 0;
        while(!pq.isEmpty()) {
            Point p = pq.poll();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
            i++;
        }
        return ans;
    }
}
