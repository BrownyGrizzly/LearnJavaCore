package Collection;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một mảng
        Integer[] array = {5, 2, 8, 1, 10};

        // In ra mảng ban đầu
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));

        // Sắp xếp mảng
        Arrays.sort(array);

        // In ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        // Tìm kiếm phần tử trong mảng
        int index = Arrays.binarySearch(array, 8);
        System.out.println("Phần tử 8 được tìm thấy tại vị trí: " + index);
    }
}
