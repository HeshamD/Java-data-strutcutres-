package WorkingWithStacks;

import java.util.Arrays;

public class MyStack {
    //create a stack
    //push()
    //pop()
    //peek()
    //isEmpty()

    private int[] items = new int[5];
    private int count;
    public void push(int item){
        if(count == items.length){ // that means the stack is full
            throw new StackOverflowError();
        }
        items[count] = item;
        count++;
    }
    public int pop(){
        if(count == 0){
            throw new StackOverflowError();
        }
        return items[count-1];
    }
    public int peek(){
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[count-1];
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(items,0,count);
        return Arrays.toString(content);
    }
    public boolean isEmpty(){
        return count == 0;
    }

}
