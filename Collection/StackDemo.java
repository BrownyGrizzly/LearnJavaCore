package Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một Stack
        Stack<String> stack = new Stack<>();

        // Thêm các phần tử vào Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        // In ra Stack ban đầu
        System.out.println("Stack ban đầu: " + stack);

        //In ra phần tử đầu tiên
        System.out.println("Phần tử đầu tiền: " + stack.peek());

        // Xóa phần tử trên cùng của Stack
        stack.pop();

        // In ra Stack sau khi xóa
        System.out.println("Stack sau khi xóa: " + stack);
    }
}
