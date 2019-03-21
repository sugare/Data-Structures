package four;

public class LinkedList<E> {

    private int size;
    private Node head;

    public LinkedList(){
        this.size = 0;
        this.head = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(E e){
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;

        size ++;
    }

    public void add(int index, E e){
        if (index <0 || index > size){
            throw new IllegalArgumentException("Index Error");
        }

        if (index == 0){
            addFirst(e);
        }else {
            Node prev = head;

            for (int i=0; i<index-1;i++){
                prev = prev.next;
            }

            Node newNode = new Node(e);
            newNode.next = prev.next;
            prev.next = newNode;

            size ++;

        }

    }

    public void addLast(E e){
        add(size, e);
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        while (head != null){
            sb.append(head.e);
            sb.append(", ");
            head = head.next;
        }

        return sb.toString();
    }

}
