package two;

/*
* 增: O(n)
* 删: O(n)
* 改: 已知索引 O(1)，未知索引 O(n)
* 查: 已知索引 O(1)，未知索引 O(n)
* */
public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity){
        this.data = (E[])new Object[capacity];
    }

    public Array(){
        this(10);
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getCapacity(){
        return data.length;
    }

    // O(n)
    private void resize(int capacity) {

        E[] newData = (E[]) new Object[capacity];
        for (int i = 0; i< size; i++)
            newData[i] = data[i];

        data = newData;
    }

    // O(n/2) = O(n)
    public void add(int index, E e){

        if (index <0 || index > size)
            throw new IllegalArgumentException("index error");

        if (size == data.length)
            resize(data.length * 2);

        for (int i = size-1 ; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;

        size ++;
    }

    // O(n)
    public void addFirst(E e){
        add(0, e);
    }

    // O(1)
    public void addLast(E e){
        add(size, e);
    }

    // O(n)
    public boolean contains(E e){
        for (int i=0;i<size;i++){
            return data[i] == e;
        }
        return false;
    }

    // O(n)
    public int find(E e){
        for (int i=0;i<size;i++){
            if (data[i] == e)
                return i;
        }
        return -1;
    }

    // O(n/2) = O(n)
    public E remove(int index){

        if (index <0 || index > size)
            throw new IllegalArgumentException("index error");

        E temp = data[index];

//        // throw new IndexOutOfBoundsException()
//        for (int i=index; i<size; i++){
//            data[i] = data[i+1];
//        }

        for (int i=index+1; i<size; i++){
            data[i-1] = data[i];
        }
        size--;

        if (size == data.length / 4  && data.length / 2 != 0)
            resize(data.length / 2);

        return temp;
    }

    // O(n)
    public E removeFirst(){
        return  remove(0);
    }

    // O(1)
    public E removeLast(){
        return  remove( size-1);
    }

    // O(n)
    public void removeElement(E e){
        int index = find(e);
        if (index != -1){
            remove(index);
        }
    }

    // O(1)
    public E get(int index){
        if (index <0 || index > size)
            throw new IllegalArgumentException("index error");
        return data[index];
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    // O(1)
    public void set(int index, E e){
        data[index] = e;
    }

    @Override
    public String toString(){


        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append("[");
        for (int i=0; i<size; i++){
            res.append(data[i]);
            if(i!=size-1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }

}
