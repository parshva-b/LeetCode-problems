class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int x: nums) single = single ^ x;
        return single;
    }
}