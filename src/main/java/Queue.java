import java.util.ArrayList;
import java.util.List;

public class Queue <E> {

    private List<E> elements;
    private int size;

    public Queue() {
        this.elements = new ArrayList<E>();
        this.size = 0;
    }

    public Queue<E> enQueue (E e) {
        Queue <E> queue = new Queue<>();

        //copy elements from this queue
        queue.elements.addAll(this.elements);
        queue.elements.add(e);
        queue.size = this.size + 1;

        return queue;
    }
    //Mutable remove and return element at front of this
    //Immutable return a queue equal to this without the front
    //@throws IllegalStateException if queue is empty
    public Queue<E> deQueue () {
        //observer and mutator
        if (size == 0) throw new IllegalStateException("Queue.deQueue");

        Queue <E> queue = new Queue<>();
        queue.elements.addAll(this.elements);
        queue.size = this.size - 1;
        elements.remove(0);

        return queue;
    }

    public E head () {
        //observer and mutator
        if (size == 0) throw new IllegalStateException("Queue.deQueue");
        return elements.get(0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String [] args){
        Queue <String> q = new Queue<>();
//        q.enQueue("cat");
//        q.enQueue("dog");
//        q.deQueue(); //expecting cat

        q = q.enQueue("cat");
        q = q.enQueue("dog");
        q.head(); //returns cat
//        q = q.deQueue(); //returns singleton queue with dog string in it
    }
}