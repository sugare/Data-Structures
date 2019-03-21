package four;

public class LinkedList<E> {

    private int size;
    private Node dummyHead;

    public LinkedList(){
        this.size = 0;
        this.dummyHead = new Node(null, null);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void add(int index, E e){
        if (index <0 || index > size){
            throw new IllegalArgumentException("Index Error");
        }

        Node prev = dummyHead;

        for (int i=0; i<index;i++){
            prev = prev.next;
        }

        Node newNode = new Node(e);
        newNode.next = prev.next;
        prev.next = newNode;

        size ++;

    }

    public void addLast(E e){
        add(size, e);
    }

    public E get(int index){
        if (index <0 || index >= size){
            throw new IllegalArgumentException("Index Error");
        }

        Node<E> cur = dummyHead.next;

        for (int i=0; i< index; i++){
            cur = cur.next;
        }

        return cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    public void set(int index, E e){
        if (index <0 || index >= size){
            throw new IllegalArgumentException("Index Error");
        }

        Node cur = dummyHead.next;
        for (int i=0; i<index; i++){
            cur = cur.next;
        }

        cur.e = e;

    }

    public boolean contains(E e){

        Node cur = dummyHead.next;
        while (cur != null){
            if (cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }

        return false;

    }

    public E removeLast(){
        return remove(size-1);
    }

    public E removeFirst(){
        return remove(0);
    }

    public E remove(int index){
        if (index <0 || index >= size){
            throw new IllegalArgumentException("Index Error");
        }

        Node prev = dummyHead;

        for (int i=0; i<index; i++){
            prev = prev.next;
        }
        Node<E> delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size --;

        return delNode.e;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        Node cur = dummyHead.next;
        while (cur != null){
            sb.append(cur.e);
            sb.append(", ");
            cur = cur.next;
        }
        return sb.toString();
    }

}
