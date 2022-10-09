package WorkingWithLinkedList;


import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next; // to keep a reference to the next node
        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int  size;
    //addFirst
    public void addFirst(int element){
        Node node = new Node(element);
        if(isEmpty()){
            first = node;
            last = node;
        }
        else{
            // want this node to point towards the first node
            node.next = first;
            first = node;
        }
        size++;
    }
    private Boolean isEmpty(){
        return first ==null;
    }

    //addLast
    public void addLast(int element){
        Node node = new Node(element);
        if(first == null){
            first = node;
            last = node;
        }
        else {
            last.next = node;
            last = node; //update last to points towards this node
        }

        size++;
    }
    //deleteFirst
    //deleteLast
    //contains
    public boolean contains(int item){
        //traverse the list
        //starting from the begining all the way to the end
        //if u find the item will return true otherwise will return false
//        var current = first;
//        while (current!=null){
//            if(current.value == item){
//                return true;
//            }
            //current = current.next;
//        }
//        return false;

        // or

        return indexOf(item) != -1;

    }
    //indexOf
    public int indexOf(int item){
        //traverse the list, from the begining to the end
        //as soon we find an item with this value >> return the index of that variable
        int index = 0;
        var current = first;
        //we haven't reach the end of the list
        while (current !=null){
            if(current.value == item) return index;
            //otherwise set current to the next node
            current = current.next;
            index++;
        }
        return -1;
    }
    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first ==last){
            first = last =null;
            size--;
            return;
        }
        // [10 -> 20 -> 30]
        var second = first.next; // second is pointing to 20
        first.next = null; // removing the link
        first = second;
        size--;
    }
    public void removeLast(){
        //to remove the last item
        // find the previous node
        // [10 -> 20 -> 30]
        // prev = 20
        // last = 30 >> we should change last and make it points to previous last = 20 and remove the link

        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first ==last){
            first = last = null;
            size--;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;

        size--;
    }
    private Node getPrevious(Node node){
        //will return the prev of that node
        var current  = first;
        while (current!=null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public void reversed(){
        LinkedList newList = new LinkedList();

        // this approach is traverse through linkedList and add from the last of the linkedList
//        var current =first;
//        while (current!=null){
//            newList.addFirst(current.value);
//            current = current.next;
//        }
//
//        while(newList.first != null){
//            System.out.println(newList.first.value);
//            newList.first = newList.first.next;
//        }

        // this approach change the linkedlist in place
        // [10 <- 20 <- 30]
        //  p     c      n
        if(isEmpty()){
            return;
        }
        var previous = first;
        var current = first.next;
        while (current!=null){
            var next = current.next;
            //chance the direction of the link
            current.next = previous;
            previous = next;
            current =next;
        }
        last = first;
        last.next = null;
        first = previous;

    }
    public void print(){
        var current = first;
        while (current!=null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int findFirst(int index){

        int k =1;
        var current = first;
        if(current == null) return -1;

        while(current!=null){

            if(k == index){
                return current.value;
            }
            k++;
            current = current.next;
        }

        return -1;

    }
    public int findKthElementEnd(int k){
        if(isEmpty())
            throw new IllegalArgumentException();

        var a =first;
        var b = first;

        for(int i=0; i<k-1;i++){
            b = b.next;
            if (b == null){
                throw new IllegalArgumentException();
            }
        }
        while (b != last){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
