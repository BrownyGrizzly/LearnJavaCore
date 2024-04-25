package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Thêm các phần tử vào HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // In ra HashSet ban đầu
        System.out.println("HashSet ban đầu: " + hashSet);

        // Kiểm tra xem một phần tử có tồn tại trong HashSet không
        System.out.println("HashSet chứa 'Banana' không? " + hashSet.contains("Banana"));

        // Xóa một phần tử khỏi HashSet
        hashSet.remove("Apple");

        // In ra HashSet sau khi xóa
        System.out.println("HashSet sau khi xóa: " + hashSet);
    }
}
