package WaitingList;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList {

    protected ConcurrentLinkedQueue<E> content;

    public WaitList () {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public WaitList (Collection <E> c) {
        this.content = (ConcurrentLinkedQueue<E>) c;
    }

    @Override
    public String toString () {
        for (E element : content)
            System.out.print (element.toString());
        return "";
    }

    @Override
    public void add (Object element) {

        content.add((E) element);

    }

    @Override
    public Object remove () {

        return content.poll();

    }

    @Override
    public boolean contains (Object element) {
        return true;
    }

    @Override
    public boolean containsAll (Collection c) {
        return true;
    }

    @Override
    public boolean isEmpty () {

        return content.isEmpty();

    }

}
