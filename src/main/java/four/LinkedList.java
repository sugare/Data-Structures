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


    public String toString(){
        StringBuilder sb = new StringBuilder();

        while (dummyHead.next != null){
            dummyHead = dummyHead.next;
            sb.append(dummyHead.e);
            sb.append(", ");
        }

        return sb.toString();
    }

}
