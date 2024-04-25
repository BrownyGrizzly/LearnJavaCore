package Collection;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Thêm các phần tử vào PriorityQueue
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);

        // Hiển thị phần tử đầu tiên của PriorityQueue
        System.out.println("Phần tử đầu tiên của PriorityQueue: " + priorityQueue.peek());

        // Xóa phần tử đầu tiên của PriorityQueue
        priorityQueue.poll();

        // Kiểm tra xem một phần tử cụ thể có tồn tại trong PriorityQueue không
        System.out.println("PriorityQueue chứa phần tử 2 không? " + priorityQueue.contains(2));

        // Chuyển đổi PriorityQueue thành một mảng
        Integer[] array = priorityQueue.toArray(new Integer[priorityQueue.size()]);
        System.out.println("Mảng từ PriorityQueue: " + java.util.Arrays.toString(array));
    }
}
