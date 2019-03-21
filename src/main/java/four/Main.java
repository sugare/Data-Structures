package four;

public class Main {

    public static void main(String[] args){

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.add(2, 666);

        ll.addLast(777);
        System.out.println(ll);
    }
}
