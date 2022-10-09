import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class WorkingWithLinkedList {
    public static void main(String[] args) {

        // 6 -> 3 -> 4 -> 2 -> 1

//        Node box1 = new Node(6);
//        Node box2 = new Node(3);
//        Node box3 = new Node(4);
//        Node box4 = new Node(2);
//        Node box5 = new Node(1);
//
//        box1.next = box2;
//        box2.next = box3;
//        box3.next = box4;
//        box4.next = box5;
//        box5.next = null;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public static boolean hasCycle(ListNode head) {
        // so basically
            // if we visit the node twice that means it's cycle
            // meaning by that i am going to use two pointers
            // slow and fast >> fast will be twice the slow pointer
            // -1 -> 2 -> 4 -> 5 -> 2 -> the next head refers to 2
            // for this example the linkedlist the tail doesn't have null
            // that means its Cycle
        // fast node if does reach null so it's not cycle
        // slow node or fast node if they meet at point that means this LinkedList is Cycle return true >> that's what will break the loop

        // 1. create an object from the nodeList slow pointer = head >> head is the first node in the LinkList
        // 2. create an object from the nodeList fast pointer = head >> head is the first node in the LinkList
        // 3. while( fast != null && fast.next != null) >> this means we haven't reached the end of the linkdlist >> b/c if we did we will return true
        // 4. slow = slow.next >> increment the slow pointer node
        // 5. fast = fast.next.next >> incremented twice
        // 6. if(slow == fast) << in this case that means this Linkdlist is cycle and i will return true // breaking the loop
        // 7. otherwise return False

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

//    public static class Node{
//        int data;
//        Node next;
//        Node(){}
//        Node(int data){
//            this.data = data;
//        }
//
//        //create a function that returns the count the size of the node
//
//        static int countNodes(Node head){
//            int i=1;
//            while (head.next != null){
//                i++;
//                head = head.next;
//            }
//            return i;
//        }
//
//    }


}
