package two;

public class Main {

    public  static void main(String[] args){


        Array<Integer> arr = new Array();
        //arr.addLast(1);
        for (int i=0; i<10; i++){
            arr.addLast(i);
        }

        System.out.println(arr);
        arr.addLast(2);
        System.out.println(arr);
        arr.addLast(3);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);

    }

}
