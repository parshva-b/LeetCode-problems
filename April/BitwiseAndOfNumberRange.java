class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        // System.out.println(msb(m));
        int res = 0;
        
        while(m > 0 && n > 0) {
            int msb_x = msb(m), msb_y = msb(n);
            if(msb_x!= msb_y) {
                break;
            }
            
            int tempVal = (1 << msb_x);
            // System.out.println(tempVal);
            res+= tempVal;
            m-= tempVal;
            n-=tempVal;
        }
        
        return res;
        // return 1;
    }
    
    public int msb(int n) {
        int MSB = -1;
        while(n > 0) {
            n = n >> 1;
            MSB++;
        }
        // System.out.println("MSB of "+n+": "+MSB);
        
        return MSB;
    }
}