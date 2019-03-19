package three;

public class Main {
//    public static void main(String[] args){
//        ArrayStack<Integer> stack = new ArrayStack<Integer>();
//
//        for (int i=0; i<5; i++){
//            stack.push(i);
//            System.out.println(stack);
//        }
//
//        stack.pop();
//        System.out.println(stack);
//
//    }


    public static void main(String[] args){
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
        for (int i=0; i<10; i++){
            queue.enqueue(i);
            System.out.println(queue);
        }

        queue.dequeue();
        System.out.println(queue);

    }
}
