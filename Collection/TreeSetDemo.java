package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        // Thêm các phần tử vào TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");

        // In ra TreeSet ban đầu
        System.out.println("TreeSet ban đầu: " + treeSet);

        // Lấy phần tử đầu tiên của TreeSet
        System.out.println("Phần tử đầu tiên của TreeSet: " + ((TreeSet<String>) treeSet).first());

        // Lấy phần tử lớn nhất của TreeSet
        System.out.println("Phần tử cuối cùng của TreeSet: " + ((TreeSet<String>) treeSet).last());
    }
}
