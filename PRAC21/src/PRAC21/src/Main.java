package PRAC21.src;


import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek()); 

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.isFull());

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue()); 
        }

        System.out.println(queue.isEmpty()); 

        Queue2<Integer> queue2 = new Queue2<>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);

        System.out.println(queue2.dequeue()); 
        System.out.println(queue2.dequeue()); 
        System.out.println(queue2.isEmpty());
        System.out.println(queue2.size());

    }
}