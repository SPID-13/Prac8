package WaitingList;

import java.util.Collection;

public interface IWaitList <E> {

    public void add (E element);

    public Object remove ();

    public boolean contains (E element);

    public boolean containsAll (Collection <E> c);

    public boolean isEmpty ();

}
