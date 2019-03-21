package four;

public class Main {

    public static void main(String[] args){

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addFirst(1);
        System.out.println(ll);
        ll.addFirst(2);
        System.out.println(ll);
        ll.addFirst(3);
        System.out.println(ll);
        ll.addFirst(4);
        System.out.println(ll);
        ll.add(2, 666);
        System.out.println(ll);
        ll.addLast(777);
        System.out.println(ll);
        ll.set(2, 100);
        System.out.println(ll);
        ll.set(3, 100);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
