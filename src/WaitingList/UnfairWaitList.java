package WaitingList;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public void remove(E element) {
        ConcurrentLinkedQueue<E> queue = new ConcurrentLinkedQueue<E>();
        for (E elementFor : content) {
            if (elementFor != element) {
                queue.add (elementFor);
            }
        }
        content = queue;
    }

    public void moveToBack (E element) {
        ConcurrentLinkedQueue<E> queue = new ConcurrentLinkedQueue<E>();
        for (E elementFor : content) {
            if (elementFor != element) {
                queue.add(elementFor);
            }
        }
        for (E elementFor : content ) {
            if (elementFor != element) {
                queue.add(elementFor);
            }
        }
        content = queue;
    }
}
