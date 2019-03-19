package three;

public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front;
    private int tail;
    private int size;

    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity(){
        return data.length -1;
    }

    public boolean isEmpty() {
        return front == tail;
    }

    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("Empty");
        }
        return data[front];
    }

    public void enqueue(E e) {

        if ((tail + 1) % data.length == front ){
            resize(getCapacity() * 2);
        }

        data[tail] = e;
        tail = (tail+1) % data.length;
        size ++;

    }

    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i=0; i< size ; i++ ){
            newData[i] = data[(i + front) % data.length];
        }

        data = newData;
        front = 0;
        tail = size;
    }

    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("Empty");
        }

        E ret = data[front];

        front = (front + 1) % data.length;
        size --;

        if (size == getCapacity() / 4 && getCapacity() / 2 != 0){
            resize(getCapacity() / 2);
        }

        return ret;
    }


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("LoopQueue: size = %d, capacity = %d\n", size , getCapacity()));
        res.append("front [");
        for (int i=front; i != tail ; i = (i + 1) % data.length){
            res.append(data[i]);
            if ((i+1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args){
        LoopQueue<Integer> queue = new LoopQueue<Integer>();
        for (int i=0; i<11; i++){
            queue.enqueue(i);
            System.out.println(queue);
        }

        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);

    }
}
