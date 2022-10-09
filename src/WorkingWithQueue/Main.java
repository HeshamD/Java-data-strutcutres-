package WorkingWithQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        Queue<Integer> n = new ArrayDeque<>();
//
//        n.offer(3);
//        n.offer(4);
//        n.offer(5);
//        n.offer(6);
//        System.out.println(n.toString());
//        System.out.println(reverse(n));

//        ArrayQueue n = new ArrayQueue(5);
//
//        n.enQueue(5);
//        n.enQueue(4);
//        n.enQueue(6);
//        //n.enQueue(22);
//        //n.enQueue(20);
//        //n.enQueue(10);
//        n.print();
//        System.out.println(n.isFull());
//        System.out.println(n.deQueue());
//        System.out.println(n.peek());
//        System.out.println(n.isEmpty());

//        QueueStack q = new QueueStack(); //first in first out
//        q.enqueue(10);
//        q.enqueue(120);
//        q.enqueue(300);
//        System.out.println(q.dequeue());
//        System.out.println(q.peek());
//        q.enqueue(10);
//        System.out.println(q.peek());

        PriorityQueue q = new PriorityQueue(5);
        q.add(2);
        q.add(4);
        q.add(1);
        q.add(1);
        q.add(3);
        q.add(5);
        System.out.println(q.toString());


    }

    static Queue<Integer> reverse(Queue<Integer> input){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> result = new ArrayDeque<>();
        for(var i : input){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            result.offer(stack.pop());
        }
        return result;
    }


}
