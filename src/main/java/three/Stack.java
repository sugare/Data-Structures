package three;

/**
 * Fist In Last Out (FIFO)
 * Scenarios: Undo / System call stack
 *
 * @param <E>
 */

public interface Stack<E> {

    public int getSize();
    public boolean isEmpty();
    public void push(E e);
    public E pop();
    public E peek();

}
