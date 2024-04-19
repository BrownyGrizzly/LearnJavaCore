public class StaticFinalDemo {
    // Biến Static
    public static int staticVar = 100;

    // Biến Final
    public final int finalVar = 50;

    // Phương thức Static
    public static void staticMethod() {
        System.out.println("Đây là phương thức static");
    }

    // Phương thức Final
    public final void finalMethod() {
        System.out.println("Đây là phương thức final");
    }

    public static void main(String[] args) {
        // Truy cập phương thức và biến Static
        System.out.println("Static variable: " + StaticFinalDemo.staticVar);
        StaticFinalDemo.staticMethod();

        // Tạo một instance của đối tượng để truy câpj biến và phương thức final
        StaticFinalDemo obj = new StaticFinalDemo();
        System.out.println("Final variable: " + obj.finalVar);
        obj.finalMethod();

        // Thay đổi biến final dẫn đến lỗi biên dịch
        // obj.finalVar = 60; // Error: cannot assign a value to final variable
    }
}

