import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// определение потокобезопасного множества
public class ThreadSafeSet<T> implements Set<T> {
    // внутреннее множество
    // потокобезопасность достигается за счет слова synchronized
    HashSet<T> set;

    public ThreadSafeSet() {
        set = new HashSet<>();
    }

    @Override
    synchronized public int size() {
        return set.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    synchronized public boolean contains(Object o) {
        return contains(o);
    }

    @Override
    synchronized public Iterator<T> iterator() {
        return set.iterator();
    }

    @Override
    synchronized public Object[] toArray() {
        
        return set.toArray();
    }

    @Override
    synchronized public <T> T[] toArray(T[] a) {
        return set.toArray(a);
    }

    @Override
    synchronized public boolean add(T e) {
        return set.add(e);
    }

    @Override
    synchronized public boolean remove(Object o) {
        return set.remove(o);
    }

    @Override
    synchronized public boolean containsAll(Collection<?> c) {
        return set.containsAll(c);
    }

    @Override
    synchronized public boolean addAll(Collection<? extends T> c) {
        return set.addAll(c);
    }

    @Override
    synchronized public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    synchronized public boolean removeAll(Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    synchronized public void clear() {
        set.clear();
    }
    
}
