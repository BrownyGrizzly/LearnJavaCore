package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Thêm các phần tử vào LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        // In ra LinkedHashSet ban đầu
        System.out.println("LinkedHashSet ban đầu: " + linkedHashSet);

        // Lấy phần tử đầu tiên của LinkedHashSet
        System.out.println("Phần tử đầu tiên của LinkedHashSet: " + ((LinkedHashSet<String>) linkedHashSet).iterator().next());
    }
}
