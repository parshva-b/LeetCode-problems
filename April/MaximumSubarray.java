class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return Integer.MIN_VALUE;
        
        int window = nums[0], max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            window = Math.max(window+nums[i], nums[i]);
            max = Math.max(window, max);
        }
        
        return max;
    }
}