import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> superMarket = new LinkedList<Person>();

        superMarket.add(new Person("alex",21));
        superMarket.add(new Person("mariam",18));
        superMarket.add(new Person("ali",40));

        //to see the first element of the queue
        System.out.println(superMarket.peek());

        //remove
        System.out.println(superMarket.poll());

        //to get the size
        System.out.println(superMarket.size());

        //to check an element
        System.out.println(superMarket.peek());

    }
    static record Person(String name, int age){}
}
