package Collection;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        // Thêm các phần tử vào PriorityBlockingQueue
        priorityBlockingQueue.offer(5);
        priorityBlockingQueue.offer(2);
        priorityBlockingQueue.offer(8);

        // Hiển thị phần tử đầu tiên của PriorityBlockingQueue
        System.out.println("Phần tử đầu tiên của PriorityBlockingQueue: " + priorityBlockingQueue.peek());

        // Xóa phần tử đầu tiên của PriorityBlockingQueue
        priorityBlockingQueue.poll();

        // Kiểm tra xem một phần tử cụ thể có tồn tại trong PriorityBlockingQueue không
        System.out.println("PriorityBlockingQueue chứa phần tử 2 không? " + priorityBlockingQueue.contains(2));

        // Chuyển đổi PriorityBlockingQueue thành một mảng
        Integer[] array = priorityBlockingQueue.toArray(new Integer[priorityBlockingQueue.size()]);
        System.out.println("Mảng từ PriorityBlockingQueue: " + java.util.Arrays.toString(array));
    }
}
