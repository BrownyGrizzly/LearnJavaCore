package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Thêm các phần tử vào LinkedHashMap
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 30);

        // In ra LinkedHashMap ban đầu
        System.out.println("LinkedHashMap ban đầu: " + linkedHashMap);

        // Lấy giá trị của một khóa từ LinkedHashMap
        System.out.println("Giá trị của khóa 'Orange': " + linkedHashMap.get("Orange"));

        // Lấy phần tử cuối cùng của LinkedHashMap
        System.out.println("Phần tử cuối cùng của LinkedHashMap: " + ((LinkedHashMap<String, Integer>) linkedHashMap).entrySet().iterator().next());
    }
}
