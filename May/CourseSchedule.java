class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        
        for(int i = 0; i < numCourses; i++) 
            graph[i] = new ArrayList<Integer>();
        
        for(int[] edge: prerequisites) {
            graph[edge[0]].add(edge[1]);
            indegree[edge[1]]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i]==0) 
                queue.add(i);
        }
        
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            for(int num: graph[cur]) {
                indegree[num]--;
                if(indegree[num]==0) queue.add(num);
            }
            numCourses--;
        }
        
        return numCourses == 0;
    }
}
