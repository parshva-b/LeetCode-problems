class Solution {
    public int singleNonDuplicate(int[] nums) {
        int beg = 0, end = nums.length - 1;
        while(beg<end) {
            int mid = beg + (end - beg)/2;
            
            int check = mid - 1;
            if(mid%2==0) check = mid+1;
            
            if(nums[mid]==nums[check]) beg = mid+1;
            else end = mid;
        }
        
        return nums[beg];
    }
}