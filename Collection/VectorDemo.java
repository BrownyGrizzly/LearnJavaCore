package Collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một Vector
        List<String> vector = new Vector<>();

        // Thêm các phần tử vào Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // In ra Vector ban đầu
        System.out.println("Vector ban đầu: " + vector);

        // Xóa phần tử đầu tiên
        vector.remove(0);

        // In ra Vector sau khi xóa
        System.out.println("Vector sau khi xóa: " + vector);
    }
}
