public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> processed = new HashSet<Integer>();
        processed.add(n);
        while(n != 1) {
            int copyOfN = n, sum = 0;
            
            while(copyOfN>0) {
                int temp = copyOfN % 10;
                copyOfN /= 10;
                sum = sum + temp * temp;
            }
            n = sum;
            if(processed.contains(n)) return false;
            else processed.add(n);
        }
        
        return true;
    }
}class HappyNumber {
    
}