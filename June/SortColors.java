class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return;
        
        int left = 0, right = nums.length - 1, index = 0;
        
        while(left < right && index <= right ) {
            if(nums[index] == 0) {
                nums[index] = nums[left];
                nums[left] = 0;
                index++;
                left++;
            }
            
            else if(nums[index]== 2) {
                nums[index] = nums[right];
                nums[right] = 2;
                right--;
            }
            
            else {
                index++;
            }
        }
    }
}
