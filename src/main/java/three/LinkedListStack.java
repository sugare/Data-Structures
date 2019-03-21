package three;

import four.LinkedList;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack(){
        this.list = new LinkedList<E>();
    }


    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: top> ");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args){
        LinkedListStack<Integer> ls = new LinkedListStack<Integer>();
        ls.push(1);
        System.out.println(ls);
        ls.push(2);
        System.out.println(ls);
        ls.push(3);
        System.out.println(ls);
        ls.pop();
        System.out.println(ls);

    }

}
