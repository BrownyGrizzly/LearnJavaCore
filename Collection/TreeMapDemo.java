package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Thêm các phần tử vào TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);

        // In ra TreeMap ban đầu
        System.out.println("TreeMap ban đầu: " + treeMap);

        // Lấy giá trị của một khóa từ TreeMap
        System.out.println("Giá trị của khóa 'Banana': " + treeMap.get("Banana"));

        // Lấy phần tử đầu tiên của TreeMap
        System.out.println("Phần tử đầu tiên của TreeMap: " + treeMap.entrySet().iterator().next());
    }
}
