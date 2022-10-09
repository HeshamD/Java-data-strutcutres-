package StacksClasses;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class MinStack {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> min_vals_stack = new Stack<>();

    public void push(int val){
        // we need to add whatever the elements that comes to push() to the stackS
        // we need to peek() with stack T with comparing with x
        // edgecase

        s.push(val);
        // if min_stack is not empty OR the value parameter is less than the min_stack >> then push this val to the stack
        if(min_vals_stack.isEmpty() || val < min_vals_stack.peek()){
            min_vals_stack.push(val);
        }
        // then we can push this element to the min_stack

        min_vals_stack.push(val);
    }
    public void pop(){
        s.pop();
        min_vals_stack.pop();
    }

    public int top(){
        return s.peek();
    }

    public int getMin(){
        return min_vals_stack.peek();
    }


}
