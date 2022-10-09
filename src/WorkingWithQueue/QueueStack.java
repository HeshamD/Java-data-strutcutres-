package WorkingWithQueue;

import java.util.Stack;

public class QueueStack {
    // so basically i will have two stacks to implement a queue
    // [10,12,14,2,1] >> stack to store the data

    // a stack to store the data
    // pop the data from the first stack into another stack
    // then whenver you going to pop u poping in a queue order
    private Stack<Integer> store = new Stack<>();
    private Stack<Integer> use = new Stack<>();

    public void enqueue(int element){
        if(store.isEmpty()){
            store.push(element);
            use.push(store.pop());
        }else {
            use.push(store.pop());
            store.push(element);
        }
    }
    public int peek(){
        return use.peek();
    }
    public int dequeue(){
        return use.pop();
    }


}
