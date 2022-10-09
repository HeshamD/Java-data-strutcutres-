package WorkingWithQueue;

import java.util.Arrays;
import java.util.Stack;

public class PriorityQueue {

    //sort the array
    //[1,3,4,5,7]
    //item

    private int[] items;
    private int count;

    public PriorityQueue(int capacity){
        items = new int[capacity];
    }

    public void add(int element){

        if(isFull()){
            //expand
            int[] newItems = new int[count*2];
            //loop and copy
            for(int i=0;i<count;i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        //shifting items
        int i;
        for(i=count-1;i>=0;i--){ // iterate a loop from the end to the beginning
            if(items[i]>element){
                //shift the current item
                items[i+1] = items[i];
            }else {
                break;
            }
        }
        items[i+1] = element;
        count++;
    }

    public String toString(){
        return Arrays.toString(items);
    }

    public boolean isEmpty(){
        return items.length == 0;
    }

    public boolean isFull(){
        return items.length == count;
    }

    public int remove(){
        if(isEmpty()){
            throw new IllegalStateException();
        }

        return items[--count];
    }

}
