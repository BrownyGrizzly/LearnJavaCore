package Collection;

import java.util.EnumSet;

public class EnumSetDemo {
    enum Color {RED, GREEN, BLUE};

    public static void main(String[] args) {
        EnumSet<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN);

        // In ra EnumSet ban đầu
        System.out.println("EnumSet ban đầu: " + enumSet);

        // Thêm một phần tử mới vào EnumSet
        enumSet.add(Color.BLUE);

        // In ra EnumSet sau khi thêm
        System.out.println("EnumSet sau khi thêm: " + enumSet);

        // Kiểm tra xem một phần tử có tồn tại trong EnumSet không
        System.out.println("EnumSet chứa Color.RED không? " + enumSet.contains(Color.RED));

        // Xóa một phần tử khỏi EnumSet
        enumSet.remove(Color.GREEN);

        // In ra EnumSet sau khi xóa
        System.out.println("EnumSet sau khi xóa: " + enumSet);
    }
}
