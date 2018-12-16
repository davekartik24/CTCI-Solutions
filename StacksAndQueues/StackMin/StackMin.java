
class StackMin {
    
    ArrayDeque<Integer> stack;
    int min; 

    /** initialize your data structure here. */
    public StackMin() {
        
        stack = new ArrayDeque<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x <= min) {
            stack.push(min);
            min = x;
        }
         stack.push(x);
    }
    
    public void pop() {
        if(stack.pop() == min) {
            
            min = stack.pop();
        }
    }
    
    public int top() {
        
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}