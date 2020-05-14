class MinStack {
    Stack<Integer> tos = new Stack<>();
    Stack<Integer> min = new Stack<>();
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        tos.push(x);
        if(!min.isEmpty() && min.peek() < x) min.push(min.peek());
        else min.push(x);
    }
    
    public void pop() {
        tos.pop();
        min.pop();
    }
    
    public int top() {
        return tos.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */