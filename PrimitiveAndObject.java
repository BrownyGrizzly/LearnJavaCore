public class PrimitiveAndObject {
    public static void main(String[] args) {
        //Giá trị khởi tạo của primitive data type là 0
        //Giá trị khởi tạo của object data type là null
        //Primitive data type có tính tham trị
        int a = 10;
        int b = a;
        System.out.println("Giá trị ban đầu của a = " + a + ", giá trị ban đầu của b = " + b);
        b = b + 10;
        System.out.println("Giá trị sau của a = " + a + ", giá trị sau của b = " + b);
        //Object data type có tính tham chiếu
        TestObject testObject1 = new TestObject("Đây là 1");
        TestObject testObject2 = testObject1;
        System.out.println("testObject1 là: " + testObject1.getDescription() +", testObject2 là: " + testObject2.getDescription());
        testObject2.setDescription("Đây là 2");
        System.out.println("Sau đó testObject1 là: " + testObject1.getDescription() +", testObject2 là: " + testObject2.getDescription());
    }
}
