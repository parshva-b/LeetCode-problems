class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> hasSum = new HashMap<>();
        hasSum.put(0, -1);
        int sum = 0, max = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : 1);
            if(hasSum.containsKey(sum)) max = Math.max(max, i-hasSum.get(sum));
            else hasSum.put(sum, i);
        }
        return max;
    }
}
