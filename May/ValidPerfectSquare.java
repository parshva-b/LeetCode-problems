class Solution {
    public boolean isPerfectSquare(int num) {
        int beg = 1, end = num;
        while(beg<=end) {
            int mid = beg + (end - beg)/2;
            int temp = num / mid, remain = num % mid;
            if(temp == mid && remain == 0) return true;
            else if(temp > mid) beg = mid+1;
            else end = mid - 1;
        }
        
        return false;
    }
}