class Solution {
    public String removeKdigits(String num, int k) {
        if(k == 0) return num;
        if(k == num.length()) return "0";
        
        Stack<Integer> tos = new Stack<>();
        
        for(char x: num.toCharArray()) {
            int cur = Integer.parseInt(String.valueOf(x));
            while(!tos.isEmpty() && tos.peek()>cur && k>0) {
                tos.pop();
                k--;
            }
            tos.push(cur);
        }
        
        while(k >0) {
            tos.pop();
            k--;
        }
        
        String ans = "";
        while(!tos.isEmpty()) {ans = String.valueOf(tos.pop()) + ans;}
        
        while(ans.length() > 1 && ans.charAt(0) == '0') ans = ans.substring(1);
        
        if(ans.length() == 0) return "0";
        return ans;
    }
}