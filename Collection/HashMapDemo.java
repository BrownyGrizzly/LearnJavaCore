package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 30);

        // In ra HashMap ban đầu
        System.out.println("HashMap ban đầu: " + hashMap);

        // Lấy giá trị của một khóa từ HashMap
        System.out.println("Giá trị của khóa 'Apple': " + hashMap.get("Apple"));

        // Xóa một phần tử khỏi HashMap
        hashMap.remove("Banana");

        // In ra HashMap sau khi xóa
        System.out.println("HashMap sau khi xóa: " + hashMap);
    }
}
