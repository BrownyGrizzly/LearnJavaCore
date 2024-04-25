package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Thêm các phần tử vào Deque
        deque.offerFirst("Apple");
        deque.offerLast("Banana");
        deque.offerLast("Orange");

        // Hiển thị phần tử đầu tiên và cuối cùng của Deque
        System.out.println("Phần tử đầu tiên của Deque: " + deque.peekFirst());
        System.out.println("Phần tử cuối cùng của Deque: " + deque.peekLast());

        // Xóa phần tử đầu tiên và cuối cùng của Deque
        deque.pollFirst();
        deque.pollLast();

        // Hiển thị kích thước của Deque
        System.out.println("Kích thước của Deque sau xóa phần tử đầu cuối: " + deque.size());
    }
}
