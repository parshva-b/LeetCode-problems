class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> weights = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int x: stones) weights.add(x);
        
        while(weights.size() > 1) {
            int y = weights.poll(), x = weights.poll();
            
            if(x!=y) weights.add(y-x);
        }
        
        if(weights.size() == 0) return 0;
        return weights.peek();
    }
}