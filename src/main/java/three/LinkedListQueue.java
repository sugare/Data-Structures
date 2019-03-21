package three;

import four.LinkedList;
import four.Node;

public class LinkedListQueue<E> implements Queue<E> {

    private int size;
    private Node<E> head;
    private Node<E> tail;

    public LinkedListQueue(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E getFront() {
        return head.e;
    }

    @Override
    public void enqueue(E e) {
        Node newNode = new Node(e);
        if (tail == null){
            head = newNode;
            tail = head;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }

        size++;

    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("Empty");
        }

        Node<E> retNode = head;
        head = head.next;
        retNode.next = null;
        size --;

        return retNode.e;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Front: ");
        Node cur = head;
        while(cur != null) {
            sb.append(cur + ", ");
            cur = cur.next;
        }
        sb.append(" tail");
        return sb.toString();
    }

    public static void main(String[] args){
        LinkedListQueue<Integer> lq = new LinkedListQueue<Integer>();
        lq.enqueue(1);
        System.out.println(lq);
        lq.enqueue(2);
        System.out.println(lq);
        lq.enqueue(3);
        System.out.println(lq);
        lq.dequeue();
        System.out.println(lq);
    }
}
