package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Thêm các phần tử vào Queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Orange");

        // Hiển thị phần tử đầu tiên của Queue
        System.out.println("Phần tử đầu tiên của Queue: " + queue.peek());

        // Xóa phần tử đầu tiên của Queue
        queue.poll();

        // Hiển thị kích thước của Queue
        System.out.println("Kích thước của Queue: " + queue.size());
    }
}
