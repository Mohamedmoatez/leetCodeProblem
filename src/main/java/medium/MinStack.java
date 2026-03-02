package medium;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek()); // Maintain the current minimum
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


    /*
    Explanation of the Approach
    The key idea is to ensure that the top of minStack always holds the minimum value currently present in the stack.
    push(int val):
    The value is always pushed onto the stack.
    For minStack, we push the current minimum (which is minStack.peek()) or the new value val, whichever is smaller. This way, minStack is always synchronized with the main stack's state at that depth.
    pop():
    Both the main stack and the minStack are popped simultaneously to remove the corresponding elements and maintain alignment.
    top():
    Returns the top of the main stack as usual.
    getMin():
    Returns the top of the minStack, which is guaranteed to be the current minimum element in the main stack in O(1) time.
     */


}
