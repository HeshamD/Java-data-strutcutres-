package WorkingWithQueue;

public class ArrayQueue {
    //enqueue
    //peek
    //isFull
    //isEmpty
    //dequeue

    //[0,0,0,0,0] initial
    // queue i will have two pointers to determine the begining and ending of a queue

    private int[] queueItems;
    private int queueSize;
    private int frontPointer = queueSize;

    public ArrayQueue(int capacity){
        queueItems = new int[capacity];
    }
    public void enQueue(int element){
        //push this element to the queueArray
        //check if the array is full or not
        if(queueItems.length == queueSize){
            throw new StackOverflowError(); // the queue is full
        }
        queueItems[queueSize] = element;
        queueSize ++;
    }
    public int deQueue(){
        var re = queueItems[frontPointer];
        frontPointer++;
        return re;
    }
    public int peek(){
        return queueItems[frontPointer];
    }
    public boolean isEmpty(){
        if (queueSize !=0){
            return false;
        }
        return true;
    }
    public boolean isFull(){
        return queueItems.length == queueSize;
    }

    public void print() {
        for(int i=frontPointer;i<queueSize;i++){
            System.out.println(queueItems[i]);
        }
    }

}
