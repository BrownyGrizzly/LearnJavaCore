package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một ArrayList
        List<String> arrayList = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Hiển thị kích thước của ArrayList
        System.out.println("Kích thước của ArrayList: " + arrayList.size());

        // Kiểm tra xem ArrayList có trống không
        System.out.println("ArrayList có trống không? " + arrayList.isEmpty());

        // In ra ArrayList ban đầu
        System.out.println("ArrayList ban đầu: " + arrayList);

        //Truy xuất tới phần tử thứ 1
        System.out.println("Phần tử có chỉ số 1 là : " + arrayList.get(1));

        // Xóa phần tử đầu tiên
        arrayList.remove(0);

        // In ra ArrayList sau khi xóa
        System.out.println("ArrayList sau khi xóa: " + arrayList);
    }
}
