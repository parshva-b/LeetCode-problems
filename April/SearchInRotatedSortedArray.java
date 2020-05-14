class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            // System.out.println("mid: "+mid+", left: "+left+", right: "+right);
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] <= nums[right]) {
                if(nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else {
                if(nums[mid] > target && target >= nums[left] ) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}