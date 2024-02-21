import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// определение потокобезопасного списка
public class ThreadSafeList<T> implements List<T> {
    // внутренний список
    List<T> list;
    // мьютексы
    final ReadWriteLock lock = new ReentrantReadWriteLock();
    final Lock readLock = lock.readLock(); 
    final Lock writeLock = lock.writeLock();

    public ThreadSafeList() {
        list = new ArrayList<>();
    }

    @Override
    public int size() {
        readLock.lock();
        try {
            return list.size();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        readLock.lock();
        try {
            return list.isEmpty();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean contains(Object o) {
        readLock.lock();
        try {
            return list.contains(o);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public Iterator<T> iterator() {
        readLock.lock();
        try {
            return list.iterator();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public Object[] toArray() {
        readLock.lock();
        try {
            return list.toArray();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public <T> T[] toArray(T[] a) {
        readLock.lock();
        try {
            return list.toArray(a);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean add(T e) {
        writeLock.lock();
        try {
            return list.add(e);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public boolean remove(Object o) {
        writeLock.lock();
        try {
            return list.remove(o);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        readLock.lock();
        try {
            return list.containsAll(c);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        writeLock.lock();
        try {
            return list.addAll(c);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        writeLock.lock();
        try {
            return list.addAll(index, c);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        writeLock.lock();
        try {
            return list.removeAll(c);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        writeLock.lock();
        try {
            return list.retainAll(c);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void clear() {
        writeLock.lock();
        try {
            list.clear();
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public T get(int index) {
        readLock.lock();
        try {
            return list.get(index);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public T set(int index, T element) {
        writeLock.lock();
        try {
            return list.set(index, element);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public void add(int index, T element) {
        writeLock.lock();
        try {
            list.add(element);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public T remove(int index) {
        writeLock.lock();
        try {
            return list.remove(index);
        } finally {
            writeLock.unlock();
        }
    }

    @Override
    public int indexOf(Object o) {
        readLock.lock();
        try {
            return list.indexOf(o);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        readLock.lock();
        try {
            return list.lastIndexOf(o);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public ListIterator<T> listIterator() {
        readLock.lock();
        try {
            return list.listIterator();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        readLock.lock();
        try {
            return list.listIterator(index);
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        readLock.lock();
        try {
            return list.subList(fromIndex, toIndex);
        } finally {
            readLock.unlock();
        }
    }

}
