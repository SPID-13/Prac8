package WaitingList;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity;
    private int now;

    public BoundedWaitList (int capacity) {
        this.content = new ConcurrentLinkedQueue<>();
        this.capacity = capacity;
        this.now = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add (Object element) {
        if (now < capacity) {
            this.content.add((E) element);
            now++;
        } else
            System.out.println("Недостаточно места для добавления элемента.");
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "content=" + content +
                '}';
    }
}
