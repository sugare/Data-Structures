package three;

public interface Queue<E> {

    public int getSize();
    public boolean isEmpty();
    public E getFront();
    public void enqueue(E e);
    public E dequeue();


}
