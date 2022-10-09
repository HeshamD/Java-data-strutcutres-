package WorkingWithLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.removeLast();
        list.removeFirst();
        //System.out.println(list.contains(30));
        //System.out.println(list.size());
        var arraytolist = list.toArray(); //converting to array
        //System.out.println(arraytolist);
        var myList = new WorkingWithLinkedList.LinkedList();
        myList.addLast(10);
        myList.addLast(20);
        myList.addLast(30);
        myList.addLast(40);
        myList.addLast(50);
        //myList.print();
        //myList.reversed();
        System.out.println(myList.findKthElementEnd(1));
    }
}
