package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // Thêm các phần tử vào LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Hiển thị kích thước của LinkedList
        System.out.println("Kích thước của LinkedList: " + linkedList.size());

        // Kiểm tra xem LinkedList có chứa một phần tử cụ thể không
        System.out.println("LinkedList có chứa 'Banana' không? " + linkedList.contains("Banana"));

        // In ra LinkedList ban đầu
        System.out.println("LinkedList ban đầu: " + linkedList);

        // Xóa phần tử cuối cùng
        linkedList.remove(linkedList.size() - 1);

        // In ra LinkedList sau khi xóa
        System.out.println("LinkedList sau khi xóa: " + linkedList);
    }
}
