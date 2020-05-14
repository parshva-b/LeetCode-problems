class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int x: nums) {
            if(!count.containsKey(x)) count.put(x, 1);
            else count.put(x, count.get(x)+1);
        }
        
        int n = nums.length;
        for(int x: nums) {
            if(count.get(x)>n/2) return x;
        }
        
        return -1;
    }
}